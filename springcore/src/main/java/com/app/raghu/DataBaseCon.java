package com.app.raghu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbObj")
public class DataBaseCon {

	@Value("${my.db}")
	private String driver;
	@Value("${my.url}")
	private String url;
	@Value("${my.username}")
	private String username;
	@Value("${my.password}")
	private String password;
	@Value("${my.port}")
	private int port;
	@Value("${my.enable}")
	private boolean active;

	@Override
	public String toString() {
		return "bean [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", port=" + port + ", active=" + active + "]";
	}

}
