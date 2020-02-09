package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/helloController")
public class compilator {
    @GetMapping("/hello")
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok("HelloWorld");
    }

    @GetMapping("/html")
    public ModelAndView html(){
        return new ModelAndView("index");
    }
}
