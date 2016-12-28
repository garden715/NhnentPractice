package com.jungwon.service;

import java.util.List;

import com.jungwon.domain.MemberVO;

public interface SampleService {
	public List<MemberVO> getBoardList();

	public void insertMember(MemberVO member);
}
