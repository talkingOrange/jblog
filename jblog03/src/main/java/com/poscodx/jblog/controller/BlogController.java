package com.poscodx.jblog.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.poscodx.jblog.service.BlogService;
import com.poscodx.jblog.service.CategoryService;
import com.poscodx.jblog.service.fileUploadService;
import com.poscodx.jblog.vo.BlogVo;
import com.poscodx.jblog.vo.CategoryVo;

@Controller
@RequestMapping("/{id}")
public class BlogController {

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private fileUploadService fileUploadService;

	@Autowired
	private BlogService blogService;

	@Autowired
	private CategoryService categoryService;

//여길 추후에 다른 mapping 조건도 추가해야함.
	@RequestMapping({ "" })
	public String index(@PathVariable("id") String blogId, Model model) {
		BlogVo blogVo = blogService.getBlog(blogId);

		servletContext.setAttribute("blogTitle", blogVo.getTitle()); // "blogTitle"로 저장
		servletContext.setAttribute("blogId", blogVo.getBlog_id()); // "blogId"로 저장

		model.addAttribute("blogVo", blogVo);
		return "blog/main";
	}

	// 블로그 기본 관리

	@RequestMapping("/admin/basic")
	public String adminBasic(@PathVariable("id") String blogId, Model model) {
		BlogVo blogVo = blogService.getBlog(blogId);
		model.addAttribute("selectedPage", "basic");
		model.addAttribute("blogVo", blogVo);
		return "blog/admin-basic";
	}

	@RequestMapping("/admin/basic/update")
	public String update(@PathVariable("id") String blogId, BlogVo vo, MultipartFile file) {
		String image = fileUploadService.restore(file);

		if (image != null) {
			vo.setImage(image);
		}

		blogService.updateBlog(vo, blogId);

		BlogVo blogVo = blogService.getBlog(blogId);
		servletContext.setAttribute("blogTitle", blogVo.getTitle()); // "blogTitle"로 저장

		return "redirect:/{id}/admin/basic";
	}

	// 블로그 카테고리

	@RequestMapping("/admin/category")
	public String adminCategory(@PathVariable("id") String blogId, Model model) {
		List<CategoryVo> list = categoryService.getCategory(blogId);
		model.addAttribute("list", list);

		model.addAttribute("selectedPage", "category");
		return "blog/admin-category";
	}

	@RequestMapping("/admin/category/add")
	public String add(@PathVariable("id") String blogId, CategoryVo vo) {
		System.out.println("add 전" + vo);
		categoryService.addCategory(blogId,vo);
		System.out.println("add 후" + vo);
		System.out.println("add 후 , no:" + vo);
		return "redirect:/{id}/admin/category";
	}
	
	@RequestMapping("/admin/category/delete/{no}")
	public String delete(@PathVariable("no") Long no, @PathVariable("id") String blogId) {
		
		categoryService.deleteCategory(no, blogId);
		
		return "redirect:/{id}/admin/category";
	}

	// 블로그 글쓰기

	@RequestMapping("/admin/write")
	public String adminWrite(@PathVariable("id") String blogId, Model model) {
		// BlogVo blogVo = blogService.getBlog(blogId);
		// model.addAttribute("blogVo", blogVo);
		model.addAttribute("selectedPage", "write");
		return "blog/admin-write";
	}

}