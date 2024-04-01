package com.app.raghu.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix= "my.app")
public class EmailService {
	
	private String host;
	private int port;
	private String username;
	private boolean active;
	private List<Integer> modelNumber;
	private Set<Integer> modelSet;
	private Map<String, Integer> mobile;
	private Message mob;
	
	

}
