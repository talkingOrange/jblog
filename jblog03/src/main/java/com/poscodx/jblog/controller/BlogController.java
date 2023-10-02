package com.poscodx.jblog.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.poscodx.jblog.service.BlogService;
import com.poscodx.jblog.service.fileUploadService;
import com.poscodx.jblog.vo.BlogVo;

@Controller
@RequestMapping("/{id}")
public class BlogController {

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private fileUploadService fileUploadService;

	@Autowired
	private BlogService blogService;

//여길 추후에 다른 mapping 조건도 추가해야함.
	@RequestMapping({ "" })
	public String index(@PathVariable("id") String blogId, Model model) {
		BlogVo blogVo = blogService.getBlog(blogId);

		servletContext.setAttribute("blogTitle", blogVo.getTitle()); // "blogTitle"로 저장
		servletContext.setAttribute("blogId", blogVo.getBlog_id()); // "blogId"로 저장

		model.addAttribute("blogVo", blogVo);
		return "blog/main";
	}

	@RequestMapping("/admin/basic")
	public String adminBasic(@PathVariable("id") String blogId, Model model) {
		BlogVo blogVo = blogService.getBlog(blogId);
		model.addAttribute("blogVo", blogVo);
		return "blog/admin-basic";
	}

	@RequestMapping("/admin/basic/update")
	public String update(@PathVariable("id") String blogId, BlogVo vo, MultipartFile file) {

		String image = fileUploadService.restore(file);
		BlogVo blogVo = blogService.getBlog(blogId);

		if (image != null) {
			vo.setImage(image);
		}

		blogService.updateBlog(vo, blogId);
		

		servletContext.setAttribute("blogTitle", blogVo.getTitle()); // "blogTitle"로 저장

		return "redirect:/{id}/admin/basic";
	}

}