package com.jungwon.service;

import java.util.List;

public interface SampleService<E> {
	public List<E> getList();

	public void insert(E vo);

	public E selectOne(int id);
	public void update(E vo);
	public boolean validatePassword(int id, String password);

	public void deleteOne(E vo);
}
