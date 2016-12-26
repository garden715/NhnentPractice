package com.jungwon.junit;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/* 모든 테스트 파일이 상속할 추상클래스
 * - 어노테이션 자동 추가
 * - Logger 
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public abstract class AbstractTest {

	protected static final Logger logger = 
			LoggerFactory.getLogger(AbstractTest.class);

}
