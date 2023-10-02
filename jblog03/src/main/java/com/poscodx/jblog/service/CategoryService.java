package com.poscodx.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscodx.jblog.repository.CategoryRepository;
import com.poscodx.jblog.vo.CategoryVo;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<CategoryVo> getCategory(String blogId) {
		return categoryRepository.findById(blogId);
	}
	
	public Boolean addCategory(String blogId, CategoryVo vo) {
		vo.setBlog_id(blogId);
		return categoryRepository.insert(vo);
	}
}
