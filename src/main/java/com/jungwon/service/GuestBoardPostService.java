package com.jungwon.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jungwon.dao.GuestBoardPostDAO;
import com.jungwon.domain.Post;

@Service("guestBoardPostService")
public class GuestBoardPostService implements SampleService<Post> {

	@Resource
	private GuestBoardPostDAO postDAO;
	
	@Override
	public List<Post> getList() {
		List<Post> boards = postDAO.getList();
		return boards;
	}

	@Override
	public void insert(Post vo) {
		postDAO.register(vo);
	}

}
