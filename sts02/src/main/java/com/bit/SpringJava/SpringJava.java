package com.bit.SpringJava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.service.Remote;

//제어역전 (IOC)
public class SpringJava {

	public static void main(String[] args) {

		org.springframework.context.ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");	//xml파일을 읽어들이는것
		
		Remote obj=(Remote) ac.getBean("remote");	//xml파일의 프로퍼티 name속성의값을 입력
		obj.func3();
	}

}
