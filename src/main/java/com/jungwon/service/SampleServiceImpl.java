package com.jungwon.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jungwon.dao.MemberDAO;
import com.jungwon.domain.MemberVO;

@Service("memberService")
public class SampleServiceImpl implements SampleService {
	@Resource
	private MemberDAO memberDAO;

	public List<MemberVO> getBoardList() {
		List<MemberVO> boards = memberDAO.getList();

		return boards;
	}

	@Override
	public void insertMember(MemberVO member) {
		memberDAO.register(member);
	}
}