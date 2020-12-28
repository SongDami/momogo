package com.momogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.momogo.service.memberService;

@Controller
public class memberController {
    
    @Autowired
    private memberService memberService;
    
    @GetMapping(value="/join.do")
    public String join(Model model) {
        

        
        return "join";
    }

}
