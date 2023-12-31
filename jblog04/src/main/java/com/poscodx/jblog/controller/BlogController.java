package com.poscodx.jblog.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.poscodx.jblog.security.AuthUser;
import com.poscodx.jblog.service.BlogService;
import com.poscodx.jblog.service.CategoryService;
import com.poscodx.jblog.service.PostService;
import com.poscodx.jblog.service.fileUploadService;
import com.poscodx.jblog.vo.BlogVo;
import com.poscodx.jblog.vo.CategoryVo;
import com.poscodx.jblog.vo.PostVo;
import com.poscodx.jblog.vo.UserVo;

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

	@Autowired
	private PostService postService;

	@RequestMapping({ "" })
	public String index(@PathVariable("id") String blogId, Model model,
			@RequestParam(value = "c", required = true, defaultValue = "") Long categoryNo,
			@RequestParam(value = "n", required = true, defaultValue = "") Long postNo) {
		BlogVo blogVo = blogService.getBlog(blogId);

		servletContext.setAttribute("blogTitle", blogVo.getTitle()); // "blogTitle"로 저장
		servletContext.setAttribute("blogId", blogVo.getBlog_id()); // "blogId"로 저장

		// category값
		List<CategoryVo> list = categoryService.getCategory(blogId);
		model.addAttribute("list", list);

		// post값
		List<PostVo> postList = postService.getPost(blogId, categoryNo);
		model.addAttribute("postList", postList);

		// post 개별 값
		PostVo postVo = postService.getPostDetail(blogId, categoryNo, postNo);

		model.addAttribute("categoryNo", categoryNo);
		model.addAttribute("postNo", postNo);

		model.addAttribute("postVo", postVo);

		model.addAttribute("blogVo", blogVo);
		return "blog/main";
	}

	// 블로그 기본 관리

	@RequestMapping("/admin/basic")
	public String adminBasic(@PathVariable("id") String blogId, HttpServletRequest request, Model model) {
		BlogVo blogVo = blogService.getBlog(blogId);
		HttpSession session = request.getSession();
		UserVo authUser = (UserVo) session.getAttribute("authUser");

		if (!authUser.getId().equals(blogId)) {
			
			return "redirect:/{id}";
		}

		model.addAttribute("selectedPage", "basic");
		model.addAttribute("blogVo", blogVo);

		return "blog/admin-basic";
	}

	@RequestMapping("/admin/basic/update")
	public String update(@PathVariable("id") String blogId,  BlogVo vo, MultipartFile file) {
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
	public String adminCategory(@PathVariable("id") String blogId, HttpServletRequest request, Model model) {
		List<CategoryVo> list = categoryService.getCategory(blogId);

		HttpSession session = request.getSession();
		UserVo authUser = (UserVo) session.getAttribute("authUser");

		if (!authUser.getId().equals(blogId)) {
			
			return "redirect:/{id}";
		}
		
		
		model.addAttribute("list", list);
		model.addAttribute("selectedPage", "category");

		return "blog/admin-category";
	}

	@RequestMapping("/admin/category/add")
	public String add(@PathVariable("id") String blogId, CategoryVo vo) {
		categoryService.addCategory(blogId, vo);

		return "redirect:/{id}/admin/category";
	}

	@RequestMapping("/admin/category/delete/{no}")
	public String delete(@PathVariable("no") Long no, @PathVariable("id") String blogId, CategoryVo vo) {
		System.out.println("카테고리에 대한 정보" + vo);
		categoryService.deleteCategory(no, blogId);
		postService.deletePost(no);

		return "redirect:/{id}/admin/category";
	}

	// 블로그 글쓰기

	@RequestMapping("/admin/write")
	public String adminWrite(@PathVariable("id") String blogId, HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		UserVo authUser = (UserVo) session.getAttribute("authUser");

		if (!authUser.getId().equals(blogId)) {
			
			return "redirect:/{id}";
		}
		
		// category값
		List<CategoryVo> list = categoryService.getCategory(blogId);
		model.addAttribute("list", list);

		model.addAttribute("selectedPage", "write");
		return "blog/admin-write";
	}

	@RequestMapping("/admin/write/add")
	public String addWrite(@PathVariable("id") String blogId, PostVo postVo,
			@RequestParam(value = "c", required = true, defaultValue = "1") Long category) {
		postVo.setCategory_no(category);
		postService.addPost(postVo);

		categoryService.updateCategoryPostNum(category);

		return "redirect:/{id}";
	}

}