package com.example.springboot35thymeleaf.controller;

import com.example.springboot35thymeleaf.pojo.User;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Locale;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/17 12:32
 * @Description TODO
 */
@Controller
public class ListController {
    @GetMapping("/list")
    public String list(Model model) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("takagi", 18));
        users.add(new User("takagi2", 28));
        model.addAttribute("users",users);
        return "list";
    }

}
