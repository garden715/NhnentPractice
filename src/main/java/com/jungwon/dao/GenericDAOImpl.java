package com.jungwon.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public abstract class GenericDAOImpl<E, K> implements GenericDAO<E, K> {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.jungwon.mapper.PostMapper";

	@Override
	public K getTime() {
		return sqlSession.selectOne(namespace + ".getNow");
	}

	@Override
	public void register(E vo) {
		sqlSession.insert(namespace + ".register", vo);
	}

	@Override
	public E get(int userid) {
		return sqlSession.selectOne(namespace + ".get", userid);
	}

	@Override
	public List<E> getList() {
		return sqlSession.selectList(namespace + ".getList");
	}
}
