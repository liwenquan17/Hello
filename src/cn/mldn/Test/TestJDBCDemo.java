package cn.mldn.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBCDemo {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver" ;
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:mldn" ;
	public static final String DBUSER = "scott" ;
	public static final String DBPASSWORD = "tiger" ;
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER) ;	// 进行数据库驱动的加载
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD) ;
		System.out.println(conn);
		conn.close(); 
		System.out.println("Hello");
	}
}
