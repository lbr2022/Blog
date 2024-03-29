package com.blog.service.impl;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import com.blog.dao.BloggerDao;
import com.blog.entity.Blogger;
import com.blog.service.BloggerService;

@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{
	@Resource
	private BloggerDao bloggerDao;

	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Integer update(Blogger blogger) {
		SecurityUtils.getSubject().getSession().setAttribute("currentUser", blogger);
		return bloggerDao.update(blogger);
	}

	public Blogger find() {
		return bloggerDao.find();
	}
	
}
