package com.jungwon.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jungwon.dao.UserDao;
import com.jungwon.domain.User;

public class UserDaoTest {

	@Test
	public void addAndGet() throws SQLException, ClassNotFoundException {
		ApplicationContext context = new ClassPathXmlApplicationContext("datasource-context.xml");

		UserDao dao = context.getBean("userDao", UserDao.class);

		dao.delete();
		
		User user = new User();
		user.setId("jungwon");
		user.setName("seojungwon");
		user.setPassword("1234");

		dao.add(user);

		User user2 = dao.get(user.getId());

		assertThat(user2.getName(), is(user.getName()));
		assertThat(user2.getPassword(), is(user.getPassword()));
	}
}
