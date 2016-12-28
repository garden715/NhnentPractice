package com.jungwon.dao;

import java.util.List;

public interface GenericDAO<E, K> {
	public K getTime();
	public void register(E vo);
	public E get(int userid);
	public List<E> getList();
	
	//public void update();
	//public void delete();

}
