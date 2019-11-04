package com.hqyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageController {
	@RequestMapping("/error")
	public String error(){
		return "error";
	}
	@RequestMapping("/main")
	public String main(){
		return "index";
	}
}
