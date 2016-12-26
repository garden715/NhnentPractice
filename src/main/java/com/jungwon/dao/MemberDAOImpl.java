package com.jungwon.dao;

import org.springframework.stereotype.Repository;

import com.jungwon.domain.MemberVO;

@Repository
public class MemberDAOImpl extends GenericDAOImpl<MemberVO, String> implements MemberDAO{
	
}
