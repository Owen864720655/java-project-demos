/**
 * Project Name: project_framework_design_java
 * File Name: Exam.java
 * Package Name: com.fanglei.example.exam
 * Date: Jul 6, 2017 9:37:20 PM
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
 * ClassName: Exam
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 6, 2017 9:37:20 PM
 */
public class Exam
{
	/**
	 * The paper
	 */
	private Paper paper = new Paper();

	/**
	 * The students who take this exam
	 */
	private Set<Student> students = new HashSet<Student>();

	/**
	 * Constructor
	 * 
	 * @param paper
	 * @param students
	 */
	public Exam(Paper paper, Set<Student> students)
	{
		super();
		this.paper = paper;
		this.students = students;
	}



	/**
	 * paper.
	 * 
	 * @return  the paper
	 */
	public Paper getPaper()
	{
		return paper;
	}



	/**
	 * paper.
	 * 
	 * @param paper the paper to set
	 */
	public void setPaper(Paper paper)
	{
		this.paper = paper;
	}





	/**
	 * students.
	 * 
	 * @return  the students
	 */
	public Set<Student> getStudents()
	{
		return students;
	}



	/**
	 * students.
	 * 
	 * @param students the students to set
	 */
	public void setStudents(Set<Student> students)
	{
		this.students = students;
	}



	/**
	 * gradeOnePaer
	 * 
	 * 
	 * @param paper
	 * @param answerSheet
	 * @return
	 */
	public int gradeOnePaer(Paper paper, AnswerSheet answerSheet)
	{
		int score = 0;
		Map<String, Question> questions = paper.getQuestions();
		Map<String, Integer> answers = answerSheet.getAnswers();
		for (Map.Entry<String, Question> entry : questions.entrySet())
		{
			String questionId = entry.getKey();
			Question question = entry.getValue();
			Integer answer = answers.get(questionId);
			if((answer != null) && answer.equals(question.getAnswer()))
			{
				score += question.getScore();
			}
		}
		return score;
	}


	/**
	 * grade
	 * 
	 * 
	 * @param map
	 * @param paper
	 */
	public void grade()
	{
		Map<Student, Integer> scores = new HashMap<Student, Integer>();
		for (Student student : students)
		{
			scores.put(student, gradeOnePaer(paper, student.getAnswerSheet()));
		}

		Map<Student, Integer> rankedScores = sort(scores);
		scoreToString(rankedScores);
	}

	private void scoreToString(Map<Student, Integer> scores)
	{
		int rank = 1;
		for (Map.Entry<Student, Integer> entry : scores.entrySet())
		{
			System.out.println("Rank: " + (rank++) + ", name： " + entry.getKey().getName() + ", score: " + entry.getValue());;
		}
	}

	private Map<Student, Integer> sort(Map<Student, Integer> scores)
	{
		if (scores.size() < 2)
		{
			return scores;
		}

		Map<Student, Integer> result = new HashMap<>();
		ArrayList<Student> students = new ArrayList<>(scores.keySet());

		while(scores.size() > 0)
		{
			Student bestStudent = students.get(0);
			Integer bestScore = scores.get(bestStudent);
			int studentId = 0;
			for (int i = 1; i < scores.size(); i ++)
			{
				if (scores.get(students.get(i)) > bestScore )
				{
					bestStudent = students.get(i);
					bestScore = scores.get(bestStudent);
					studentId = i;
				}
			}

			result.put(bestStudent, bestScore);
			students.remove(studentId);
			scores.remove(bestStudent);
		}

		return result;
	}
}
