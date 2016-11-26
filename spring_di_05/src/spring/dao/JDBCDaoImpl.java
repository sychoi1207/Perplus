package spring.dao;
//<bean class="xxx.JDBCDaoImpl" name="JDBCDaoImpl"/>

import org.springframework.stereotype.Repository;

@Repository
public class JDBCDaoImpl implements Dao{
	
	public void insert(){
		System.out.println("JDBC를 이용해 insert처리");
	}
	
	public void select(){
		System.out.println("JDBC를 이용해 select처리");
	}
	
}
