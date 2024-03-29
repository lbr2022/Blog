package com.blog.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.dao.LinkDao;
import com.blog.entity.Link;
import com.blog.service.LinkService;

@Service("linkService")
public class LinkServiceImpl implements LinkService{
	
	@Resource
	private LinkDao linkDao;
	
	public Link findById(Integer id) {
		return linkDao.findById(id);
	}

	public List<Link> list(Map<String, Object> paramMap) {
		return linkDao.list(paramMap);
	}

	public Long getTotal(Map<String, Object> paramMap) {
		return linkDao.getTotal(paramMap);
	}

	public Integer add(Link link) {
		return linkDao.add(link);
	}

	public Integer update(Link link) {
		return linkDao.update(link);
	}

	public Integer delete(Integer id) {
		return linkDao.delete(id);
	}

}
