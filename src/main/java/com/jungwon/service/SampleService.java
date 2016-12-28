package com.jungwon.service;

import java.util.List;

public interface SampleService<E> {
	public List<E> getList();

	public void insert(E vo);

	public E selectOne(int id);
}
