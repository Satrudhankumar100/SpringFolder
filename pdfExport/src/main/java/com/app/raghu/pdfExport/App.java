package com.app.raghu.pdfExport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.pdfExport.bean.PdfExport;
import com.app.raghu.pdfExport.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App {
	private static final Object PdfExport = null;

	public static void main(String[] args) {
		System.out.println("Hello World!");

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PdfExport pe = ac.getBean("pObj",PdfExport.class);
		System.out.println(pe);
	}
}
