package com.jungwon.service;

import java.util.Collections;
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
		return sort(boards);
	}

	@Override
	public void insert(Post vo) {
		postDAO.register(vo);
	}

	@Override
	public Post selectOne(int id) {
		// TODO Auto-generated method stub
		Post post = postDAO.get(id);
		return post;
	}

	public List<Post> sort(List<Post> posts) {
		Collections.sort(posts, (Post p1, Post p2) -> p2.getRegDate().compareTo(p1.getRegDate()));
		return posts;
	}

	@Override
	public void update(Post vo) {
		// TODO Auto-generated method stub
		postDAO.update(vo);

	}

	@Override
	public boolean validatePassword(int id, String password) {
		// TODO Auto-generated method stub
		Post post = postDAO.get(id);
		return post.getPassword().equals(password);
	}

	@Override
	public void deleteOne(Post vo) {
		// TODO Auto-generated method stub
		postDAO.delete(vo);
	}
}
