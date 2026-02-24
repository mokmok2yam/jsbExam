package com.back.jsb_exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public void index(){
        System.out.println("hello world");
    }
    @GetMapping("hello")
    public  void hello(){
        System.out.println("hello()");
    }
}
