package com.app.raghu.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.app.db")

public class MyDbCon {
	
	private String driver;
	private String url;

}
