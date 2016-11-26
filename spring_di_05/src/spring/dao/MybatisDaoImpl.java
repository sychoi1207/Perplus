package spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MybatisDaoImpl implements Dao{
	private static MybatisDaoImpl instance;
	private MybatisDaoImpl(){};
	
	public static MybatisDaoImpl getInstance(){
		if(instance==null) instance = new MybatisDaoImpl();
		return instance;
	}
	
	
	public void insert(){
		System.out.println("Mybatis를 이용해 insert처리");
	}
	
	public void select(){
		System.out.println("Mybatis를 이용해 select처리");
	}
}
