package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @GetMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @GetMapping("/processFormVersionTwo")
    public String exitedHello(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "yo!" + theName;
        model.addAttribute("message",result);
        return "helloworld";
    }
    @GetMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        theName = theName.toUpperCase();
        String result = "Hey my friend!" + theName;
        model.addAttribute("message",result);
        return "helloworld";
    }
}
