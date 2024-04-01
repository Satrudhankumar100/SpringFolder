package com.app.raghu.stereotypescope.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@Scope("prototype")
public class Product {
	
	@Value("123")
	private Integer pid;
	@Value("wl101")
	private String pcode;

}
