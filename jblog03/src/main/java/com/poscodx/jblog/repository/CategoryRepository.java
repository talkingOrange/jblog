package com.poscodx.jblog.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poscodx.jblog.vo.CategoryVo;

@Repository
public class CategoryRepository {
	@Autowired
	private SqlSession sqlSession;
	
	public List<CategoryVo> findById(String id) {
		return sqlSession.selectList("category.findById", id);
	}
	
	public int insert(CategoryVo vo) {
		return sqlSession.insert("category.insert", vo);
	}

	public int deleteByNoAndBlogId(Long no, String blogId) {
		Map<String, Object> map = new HashMap<>();
		map.put("no", no);
		map.put("blog_id", blogId);

		return sqlSession.delete("category.deleteByNoAndBlogId", map);
	}

	public void update(Long no) {
		sqlSession.update("category.update", no);		
	}
}
