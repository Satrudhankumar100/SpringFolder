package com.app.raghu.lifcycle.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("excobj")
public class ExcelExport {
	
	private String fileName;
	private String fileExt;
	public ExcelExport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileExt() {
		return fileExt;
	}
	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}
	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}
	
	@PostConstruct
	public void steup() {
		System.out.println("init method executed.....");
	}
	@PreDestroy
	public void clear() {
		System.out.println("Destroy method executed....");
	}

}
