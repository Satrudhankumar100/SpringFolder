package com.app.raghu.lifcycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.raghu.lifcycle.bean.ExcelExport;
import com.app.raghu.lifcycle.bean.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        		ExcelExport ex = ac.getBean("excobj",ExcelExport.class);
        		System.out.println(ex);
        		ac.close();
    }
}
