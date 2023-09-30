package com.poscodx.jblog.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poscodx.jblog.service.BlogService;
import com.poscodx.jblog.vo.BlogVo;

@Controller
@RequestMapping("/{id}")
public class BlogController {
	
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private BlogService blogService;

//여길 추후에 다른 mapping 조건도 추가해야함.
	@RequestMapping({"" })
	public String index(
		@PathVariable("id") String blogId, Model model) {
		BlogVo blogVo = blogService.getBlog(blogId);
		
		servletContext.setAttribute("blogTitle", blogVo.getTitle()); // "siteTitle"로 저장
		
		model.addAttribute("blogVo", blogVo);
		return "blog/main";
	}
	
	@RequestMapping("/admin/basic")
	public String adminBasic(@PathVariable("id") String blogId) {
		return "blog/admin-basic";
	}

//	@RequestMapping("")
//	public String main() {
//		return "blog/main";
//	}
	
}