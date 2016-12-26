package com.jungwon.junit;

import javax.inject.Inject;

import org.junit.Test;

import com.jungwon.dao.MemberDAO;

public class MemberDAOImplTest extends AbstractTest{

	@Inject
	private MemberDAO dao;
	
	@Test
	public void test() {
		logger.info(""+dao);
	}
}
