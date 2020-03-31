package com.blblz.spring.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Student stu = context.getBean("student", Student.class);
//		stu.displayStudentInfo();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu = context.getBean("student", Student.class);
		stu.displayStudentInfo();
		
		Student sand = context.getBean("sandeep", Student.class);
		sand.displayStudentInfo();
	}

}
