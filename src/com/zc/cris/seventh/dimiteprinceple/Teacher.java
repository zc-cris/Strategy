package com.zc.cris.seventh.dimiteprinceple;

//老师作为中间类
public class Teacher {

	// 提供英语试卷
	public  static Paper provideEnglishPaper() {
		return new EnglishPaper();
	}
	
	// 提供语文试卷
	public static Paper provideChinesePaper() {
		return new ChinesePaper();
	}
	
}
