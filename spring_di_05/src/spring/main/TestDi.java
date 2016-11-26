package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.Dao;
import spring.service.Service;

public class TestDi {
	public static void main(String[] args) {
		
		//Spring contatiner 객체 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/applicationContext.xml");
		
		Service service = (Service)context.getBean("serviceImpl");//객체를 주입받기.
		service.register();
		
	}
}

