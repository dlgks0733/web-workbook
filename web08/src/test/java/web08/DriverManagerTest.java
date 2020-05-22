package web08;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DriverManagerTest {

	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://127.0.0.1/exam?characterEncoding=UTF-8";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
