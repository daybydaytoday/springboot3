package com.example.springboot35thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/17 10:25
 * @Description TODO
 */
@Controller // @RestCotroller 适配前后端分离  @Controller适配服务端渲染
public class WellController {
    @GetMapping("/well")
    public String well(@RequestParam("name") String name,
            /* @RequestParam("path")String path,*/ Model model) {
        //返回的是模板视图的逻辑地址,1是因为ThymeLeaf默认前后缀都已经有规定了
        //物理视图 = 前缀 + 逻辑地址（下面的well） + 后缀

        //model 相当于一个数据仓库,页面可以在model去除对应的值
        model.addAttribute("name", name);
        //String msg = "<h1>" + name + " </h1>";
        //model.addAttribute("msg", msg);
        //model.addAttribute("path",path);
        //model.addAttribute("show", "takagi".equals(name));
        return "well";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
