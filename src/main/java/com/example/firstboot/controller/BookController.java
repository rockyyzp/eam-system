package com.example.firstboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController
{
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("tip", "欢迎访问第一个Spring Boot应用");
        return "hello";
    }
    @GetMapping("/rest")
    @ResponseBody
    public ResponseEntity restIndex()
    {
        return new ResponseEntity<>("欢迎访问第一个Spring Boot应用",
                null, HttpStatus.OK);
    }
}
