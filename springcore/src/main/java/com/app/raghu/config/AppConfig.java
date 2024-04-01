package com.app.raghu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
@ComponentScan("com.app.raghu")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
