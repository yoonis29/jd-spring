package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Annotate the class with the @controller sterotype annotation
public class HomeController {
    @RequestMapping("/home") //use @RequestingMapping annotation to associate the action with an HTTP request path
    public String home(){
        return "home.html"; //Return the HTML document name that contains we want the browser to displayy
    }

    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }
}
