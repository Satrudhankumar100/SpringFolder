package com.app.raghu.bean;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.book")
public class BookInfo {
	
	private String bname;
	//private List<String> authors;
	private String[] authors;
	private Set<String> versions;
	private Publisher pob;

}
