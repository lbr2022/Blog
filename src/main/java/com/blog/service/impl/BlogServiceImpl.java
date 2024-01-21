package com.blog.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.dao.BlogDao;
import com.blog.dao.CommentDao;
import com.blog.entity.Blog;
import com.blog.service.BlogService;

@Service("blogService")
public class BlogServiceImpl implements BlogService{
	
	@Resource
	private BlogDao blogDao;
	@Resource
	private CommentDao commentDao;

	public List<Blog> countList() {
		return blogDao.countList();
	}

	public List<Blog> list(Map<String, Object> map) {
		return blogDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return blogDao.getTotal(map);
	}

	public Blog findById(Integer id) {
		return blogDao.findById(id);
	}

	public Integer add(Blog blog) {
		return blogDao.add(blog);
	}

	public Integer update(Blog blog) {
		return blogDao.update(blog);
	}

	public Integer delete(Integer id) {
		commentDao.deleteByBlogId(id);
		return blogDao.delete(id);
	}

	public Integer getBlogByTypeId(Integer typeId) {
		return blogDao.getBlogByTypeId(typeId);
	}

	public Blog getLastBlog(Integer id) {
		return blogDao.getLastBlog(id);
	}

	public Blog getNextBlog(Integer id) {
		return blogDao.getNextBlog(id);
	}

}
