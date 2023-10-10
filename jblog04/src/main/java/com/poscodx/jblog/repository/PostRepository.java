package com.poscodx.jblog.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poscodx.jblog.vo.PostVo;


@Repository
public class PostRepository {
	@Autowired
	private SqlSession sqlSession;
	
	public List<PostVo> findById(String id, Long categoryNo) {
		Map<String, Object> map = new HashMap<>();
		map.put("blog_id", id);
		map.put("category_no", categoryNo);
		return sqlSession.selectList("post.findById", map);
	}
	
	public int insert(PostVo vo) {
		return sqlSession.insert("post.insert", vo);
	}

	public PostVo findByPost(String blogId, Long categoryNo, Long postNo) {
		Map<String, Object> map = new HashMap<>();
		map.put("blog_id", blogId);
		map.put("category_no", categoryNo);		
		map.put("post_no", postNo);		
		return sqlSession.selectOne("post.findByPost", map);
	}

	public int deleteByNo(Long no) {
		return sqlSession.delete("post.deleteByNo", no);
	}
}
