package com.zc.cris.seventh.dimiteprinceple;

public class Test {
	
	public static void main(String[] args) {
		Student student1 = new StudentA();
		// 学生只负责参加考试，不用关心试卷难不难，试卷在哪里，反正老师发给你，你就做
		student1.examChinese();
		student1.examEnglish();
		
		// 每个学生参加考试答案都不一样
		Student student2 = new StudentB();
		student2.examChinese();
		student2.examEnglish();
		
	}

}
