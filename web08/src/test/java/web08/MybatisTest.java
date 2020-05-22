package web08;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MybatisTest {

	@Autowired
	private SqlSessionFactory sqlfFactory;

	@Test
	public void testFactory() {
		System.out.println(sqlfFactory);
	}

	@Test
	public void testSession() throws Exception {
		try (SqlSession session = sqlfFactory.openSession()) {
			System.out.println(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
