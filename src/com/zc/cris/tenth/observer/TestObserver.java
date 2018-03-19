package com.zc.cris.tenth.observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestObserver {

	@Test
	void test() {
		
		School school = new School();
		Teacher teacher = new Teacher("李老师", school);
		Student student = new Student("猴子", school);
		school.add(student);
		school.add(teacher);
		// 通知者发出通知，所有的观察者们需要对此作出反应
		school.inform();
		
	}

}
