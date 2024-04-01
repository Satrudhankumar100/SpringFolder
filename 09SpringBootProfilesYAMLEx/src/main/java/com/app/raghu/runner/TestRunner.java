package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.raghu.bean.MyDbCon;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private MyDbCon con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);
	}

}
