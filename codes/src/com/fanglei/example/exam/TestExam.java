/**
 * Project Name: project_framework_design_java
 * File Name: TestExam.java
 * Package Name: com.fanglei.example.exam
 * Date: Jul 6, 2017 10:17:47 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: TestExam
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 6, 2017 10:17:47 PM
 */
public class TestExam
{

	public static void main(String[] args)
	{
		Question q1 = new Question("1", "first", 1, new ArrayList<String>(), 1);
		Question q2 = new Question("2", "first", 2, new ArrayList<String>(), 2);
		Question q3 = new Question("3", "first", 3, new ArrayList<String>(), 3);
		Question q4 = new Question("4", "first", 4, new ArrayList<String>(), 4);
		Map<String, Question> questions = new HashMap<String, Question>();
		questions.put("1", q1);
		questions.put("2", q2);
		questions.put("3", q3);
		questions.put("4", q4);
		Paper paper =  new Paper("English", questions);

		Map<String, Integer> answers1 = new HashMap<>();
		answers1.put("1", 2);
		answers1.put("2", 2);
		answers1.put("3", 2);
		answers1.put("4", 2);
		AnswerSheet answerSheet1 = new AnswerSheet("answerSheet1", answers1);
		Student student1 = new Student	("student1", paper, answerSheet1);

		Map<String, Integer> answers2 = new HashMap<>();
		answers2.put("1", 1);
		answers2.put("2", 2);
		answers2.put("3", 3);
		answers2.put("4", 4);
		AnswerSheet answerSheet2 = new AnswerSheet("answerSheet2", answers2);
		Student student2 = new Student	("student2", paper, answerSheet2);


		Set<Student> students = new HashSet<>();
		students.add(student1);
		students.add(student2);



		Exam exam = new Exam(paper, students);
		exam.grade();
	}
}
