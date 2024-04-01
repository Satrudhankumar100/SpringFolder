package com.app.raghu.pdfExport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.raghu.pdfExport.bean.PdfExport;

@Configuration
public class AppConfig {
	
	@Bean
	public PdfExport pObj() {
		PdfExport p=new PdfExport();
		p.setFileName("RAM");
		p.setFileAuth("guru");
		return p;
	}
	
	

}
