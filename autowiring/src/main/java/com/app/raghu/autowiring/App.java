package com.app.raghu.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.autowiring.bean.EmployeeService;
import com.app.raghu.autowiring.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService es = ac.getBean("esobj",EmployeeService.class);
        System.out.println(es);
    }
}
