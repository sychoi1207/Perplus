package spring.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.dao.Dao;
// <bean class="xx.xx.ServiceImpl" name="serviceImpl">

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
	
//	@Autowired //Dao타입의 bean을 instance 변수에 주입해라.
//	@Qualifier("mybatisDaoImpl")//Dao 타입중 name이 mybatisDaoImpl인 bean을 쥬입
	@Resource(name="mybatisDaoImpl") //bean의 name이 mybatisDaoImpl인 bean을 주입.
	private Dao dao;
	
	public ServiceImpl(Dao dao){
		this.dao = dao;
	}
	
	public ServiceImpl(){}
	
	public void register(){
		System.out.println("-------ServiceImpl:등록작업시작-------");
		
		dao.insert();
		dao.select();
		
		System.out.println("-------ServiceImpl:등록작업완료-------");	
	}
}
