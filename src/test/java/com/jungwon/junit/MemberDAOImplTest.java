package com.jungwon.junit;

import javax.inject.Inject;

import org.junit.Test;

import com.jungwon.dao.MemberDAO;
import com.jungwon.domain.MemberVO;

public class MemberDAOImplTest extends AbstractTest{

	@Inject
	private MemberDAO dao;
	
	@Test
	public void test() {
		logger.info(""+dao);
	}
	
	@Test
	public void getTimeTest() {
		logger.info(""+dao.getTime());
	}
	
	@Test
	public void registerTest() {
		MemberVO vo = new MemberVO();
		vo.setEmail("gmail.com");
		vo.setUsername("jungwon");
		vo.setUserid("hi");
		vo.setUserpw("1234");
		
		dao.register(vo);
	}
}
