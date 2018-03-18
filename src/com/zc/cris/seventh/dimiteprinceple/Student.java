package com.zc.cris.seventh.dimiteprinceple;

/**
 * 定义一个抽象学生类，具有参加考试的模板方法，答案则由不同的学生完成
 * 试卷由老师类统一发放，大家做的都是相同的试卷，并且老师发试卷之前，没有人知道试卷的题目
 * 学生答题需要试卷，试卷由老师隐藏，即学生和试卷之间的通信由第三方老师类完成，这就是 迪米特法则
 * 很好的隐藏了每个类的细节，每个类的功能彼此独立，互不干扰，最大程度的实现逻辑耦合，代码结构松耦合
 * @author chongqingwuyifan
 *
 */
public abstract class Student {

	public abstract void englishAnswer();
	
	public abstract void chineseAnswer();

	public void examEnglish() {
		 Teacher.provideEnglishPaper();
		 englishAnswer();
	}

	public void examChinese() {
		Teacher.provideChinesePaper();
		chineseAnswer();
	}

}