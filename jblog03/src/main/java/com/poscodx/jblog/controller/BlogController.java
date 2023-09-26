package com.poscodx.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//여길 추후에 사용자 id로 바꾸어야함.
@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@RequestMapping("")
	public String main() {
		return "blog/main";
	}
	
}