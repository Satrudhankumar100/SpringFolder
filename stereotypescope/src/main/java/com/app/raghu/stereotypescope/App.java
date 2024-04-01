package com.app.raghu.stereotypescope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.stereotypescope.bean.AppConfig;
import com.app.raghu.stereotypescope.bean.Product;

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
        
        Product prod = ac.getBean("product",Product.class);
        System.out.println(prod);
        System.out.println(prod.hashCode());
        
        Product prod2 = ac.getBean("product",Product.class);
        System.out.println(prod2.hashCode());
        
        System.out.println(prod==prod2);
    }
}
