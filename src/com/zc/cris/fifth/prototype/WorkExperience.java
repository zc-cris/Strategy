package com.zc.cris.fifth.prototype;

import java.util.Date;

public class WorkExperience implements Cloneable {

	private String experienceCompanyName;
	private Date experienceTime;

	// WorkExperience 的克隆方法
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getExperienceCompanyName() {
		return experienceCompanyName;
	}

	public void setExperienceCompanyName(String experienceCompanyName) {
		this.experienceCompanyName = experienceCompanyName;
	}

	public Date getExperienceTime() {
		return experienceTime;
	}

	public void setExperienceTime(Date experienceTime) {
		this.experienceTime = experienceTime;
	}

	public WorkExperience(String experienceCompanyName, Date experienceTime) {
		super();
		this.experienceCompanyName = experienceCompanyName;
		this.experienceTime = experienceTime;
	}

	public WorkExperience() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WorkExperience [experienceCompanyName=" + experienceCompanyName + ", experienceTime=" + experienceTime
				+ "]";
	}

}
