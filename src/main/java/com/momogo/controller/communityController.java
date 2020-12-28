package com.momogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.momogo.service.communityService;

@Controller
public class communityController {

	@Autowired
	private communityService communityService;
	
	@GetMapping(value="/community.do")
	public String community(Model model) {
		return "community";
	}
}
