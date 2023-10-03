package com.poscodx.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscodx.jblog.repository.PostRepository;
import com.poscodx.jblog.vo.PostVo;


@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public List<PostVo> getPost(String blogId, Long categoryNo) {
		return postRepository.findById(blogId, categoryNo);
	}
	
	public PostVo getPostDetail(String blogId, Long categoryNo, Long postNo) {
		return postRepository.findByPost(blogId, categoryNo, postNo);
	}
	
	public int addPost(PostVo vo) {
		return postRepository.insert(vo);
	}

}
