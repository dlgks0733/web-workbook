package web08;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class DatasourceTest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() throws Exception {
		
		
		try(Connection con = dataSource.getConnection()) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
