package com.example.springboot34.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/16 19:53
 * @Description TODO
 */
//一切都能实现yaml输出    实现HttpMessageConverter接口
public class MyYamlMessageConvertor extends AbstractHttpMessageConverter<Object> {

    private ObjectMapper objectMapper;


    public MyYamlMessageConvertor() {
        //TODO 这行代码是将配置文件的新的yaml格式类型 和 该MessageConvertor进行绑定，告知spring如果请求接到需要转换为yaml类型响应的，用这种MessageConvertor去解决

        super(new MediaType("text", "yaml", Charset.forName("UTF-8")));
        YAMLFactory yamlFactory = new YAMLFactory();
        yamlFactory.disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        this.objectMapper = new ObjectMapper(yamlFactory);
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        //写判断，不是基本的都能转
        return true;
    }

    @Override
    //这是传进来的转成适配的对象，但是我们现在是传出去一个yaml格式的信息，所以这里暂时不用写    @RequestBody
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    //@ResponseBody
    protected void writeInternal(Object methodReturnValue, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        try (OutputStream outputStream = outputMessage.getBody()) { //响应流并且新语法自动关流
            this.objectMapper.writeValue(outputStream, methodReturnValue);
        }
    }
}
