package com.jungwon.junit;

import javax.inject.Inject;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;

public class SqlSessionFactoryBeanTest extends AbstractTest{
	
	@Inject
	SqlSessionFactoryBean factoryBean;

	@Test
	public void test() {
		logger.info("" + factoryBean);
	}
	
	@Test
	public void sessionTest() {
		try {
			logger.info(""+factoryBean.getObject().openSession());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
