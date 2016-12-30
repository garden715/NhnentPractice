package com.jungwon.dao;

import org.springframework.stereotype.Repository;

import com.jungwon.domain.Post;

@Repository("guestBoardPostDAO")
public class GeustBoardPostDAOImpl extends GenericDAOImpl<Post, String> implements GuestBoardPostDAO{

	@Override
	public void update(Post vo) {
		sqlSession.insert(namespace + ".update", vo);
	}

	@Override
	public void delete(Post vo) {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".delete", vo);
	}
}
