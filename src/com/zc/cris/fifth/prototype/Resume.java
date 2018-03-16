package com.zc.cris.fifth.prototype;

import java.util.Date;

public class Resume implements Cloneable {

	private String name;
	private int age;
	// 该引用类通过深度复制每次产生新的对象和新的 Resume 对象绑定
	private WorkExperience workExperience;

	/**
	 * Resume 虽然实现了Cloneable 接口，并且调用父类的 clone 方法，其副本的引用属性依然是值复制，不是真正的对象复制
	 * 我们需要手动的调用原本的引用属性的 clone 方法（引用属性也必须实现 Cloneable 接口），然后将生成的引用属性的副本赋给 Resume
	 * 的副本的引用属性（稍微有点绕，有时间画个图解释）
	 */
	public Resume clone() throws CloneNotSupportedException {
		WorkExperience workExperience1 = (WorkExperience) workExperience.clone();
		Resume clone = (Resume) super.clone();
		clone.workExperience = workExperience1;
		return clone;
	}

	// 为克隆的 WorkExperience 实例重新生成属性
	public void createNewWorkExperience(String companyName, Date workTime) {
		this.workExperience.setExperienceCompanyName(companyName);
		this.workExperience.setExperienceTime(workTime);
	}

	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Resume() {
		super();
	}

	public Resume(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Resume [name=" + name + ", age=" + age + ", workExperience=" + workExperience + "]";
	}

}
