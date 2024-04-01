package com.app.raghu.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="my.app")
public class DatabaseCon {
	
	private String driver;
	private String url;
	

}
