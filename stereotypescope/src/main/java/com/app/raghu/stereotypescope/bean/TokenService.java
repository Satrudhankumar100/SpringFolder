package com.app.raghu.stereotypescope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {
	
	
	@Autowired
	private Token tokenOb;

	public TokenService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TokenService [tokenOb=" + tokenOb + "]";
	}
	
	

}
