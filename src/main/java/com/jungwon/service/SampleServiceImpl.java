package com.jungwon.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jungwon.dao.MemberDAO;
import com.jungwon.domain.MemberVO;

@Service("memberService")
public class SampleServiceImpl implements SampleService<MemberVO> {
	@Resource
	private MemberDAO memberDAO;

	@Override
	public List<MemberVO> getList() {
		List<MemberVO> boards = memberDAO.getList();

		return boards;
	}

	@Override
	public void insert(MemberVO vo) {
		// TODO Auto-generated method stub
		memberDAO.register((MemberVO)vo);
	}
}