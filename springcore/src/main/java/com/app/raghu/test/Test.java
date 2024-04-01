package com.app.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.DataBaseCon;
import com.app.raghu.config.AppConfig;

public class Test {

	public static void main(String[] args) {
			ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
			DataBaseCon db = ac.getBean("dbObj",DataBaseCon.class);
			System.out.println(db);
	}

}
