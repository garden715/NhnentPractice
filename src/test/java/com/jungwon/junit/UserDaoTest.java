package com.jungwon.junit;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jungwon.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/test-datasource-context.xml")
public class UserDaoTest {
//	
//	@Autowired
//	private ApplicationContext context;
//	
//	private UserDao dao;
//	private User user1;
//	private User user2;
//	private User user3;
//
//	@Before
//	public void setUp() {
//		this.dao = this.context.getBean("userDao", UserDao.class);
//		
//		user1 = new User("jungwon", "seojungwon", "1234");
//		user2 = new User("hi", "helloworld", "pass");
//		user3 = new User("789", "박범", "3456");
//	}
//
//	@Test
//	public void addAndGet() throws SQLException, ClassNotFoundException {
//		dao.deleteAll();
//		assertThat(dao.getCount(), is(0));
//
//		dao.add(user1);
//		dao.add(user2);
//		assertThat(dao.getCount(), is(2));
//
//		User userget1 = dao.get(user1.getId());
//
//		assertThat(userget1.getName(), is(user1.getName()));
//		assertThat(userget1.getPassword(), is(user1.getPassword()));
//
//		User userget2 = dao.get(user2.getId());
//
//		assertThat(userget2.getName(), is(user2.getName()));
//		assertThat(userget2.getPassword(), is(user2.getPassword()));
//	}
//
//	@Test
//	public void count() throws SQLException, ClassNotFoundException {
//		dao.deleteAll();
//		assertThat(dao.getCount(), is(0));
//
//		dao.add(user1);
//		assertThat(dao.getCount(), is(1));
//		dao.add(user2);
//		assertThat(dao.getCount(), is(2));
//		dao.add(user3);
//		assertThat(dao.getCount(), is(3));
//
//	}
//
//	@Test(expected = EmptyResultDataAccessException.class)
//	public void getUserFailure() throws SQLException, ClassNotFoundException {
//		dao.deleteAll();
//		assertThat(dao.getCount(), is(0));
//		dao.get("unknown_id");
//	}
	
	
	
	
	
	
//	public class MemberDAOImplTest extends AbstractTest{
//
//		@Inject
//		private MemberDAO dao;
//		
//		@Test
//		public void test() {
//			logger.info(""+dao);
//		}
//		
//		@Test
//		public void getTimeTest() {
//			logger.info(""+dao.getTime());
//		}
//		
//		@Test
//		public void registerTest() {
//			MemberVO vo = new MemberVO();
//			vo.setEmail("gmail.com");
//			vo.setUsername("jungwon");
//			vo.setUserid("gggg");
//			vo.setUserpw("1234");
//			
//			dao.register(vo);
//		}
//	}
}
