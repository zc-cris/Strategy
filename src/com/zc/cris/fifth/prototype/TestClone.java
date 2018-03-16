package com.zc.cris.fifth.prototype;

import java.util.Date;

public class TestClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Resume resume = new Resume("cris", 15);
		resume.setWorkExperience(new WorkExperience("阿迪达斯", new Date()));
		System.out.println(resume);
		
		//这样子复制两份属性完全一样，但是地址是不同的，因为是两个独立的对象实例
		Resume clone = (Resume) resume.clone();
		System.out.println(clone == resume);			// false
		
		Resume clone1 = (Resume) resume.clone();
		clone1.createNewWorkExperience("耐克", new Date());
		System.out.println(clone1);
		System.out.println(resume);
		
		
	}

}
