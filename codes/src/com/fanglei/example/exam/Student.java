/**
 * Project Name: project_framework_design_java
 * File Name: Student.java
 * Package Name: com.fanglei.example.exam
 * Date: Jul 6, 2017 9:37:34 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.exam;

/**
 * ClassName: Student
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 6, 2017 9:37:34 PM
 */
public class Student
{
	/**
	 * Student name
	 */
	private String name = "";

	/**
	 * Student's paper
	 */
	private Paper paper = new Paper();

	/**
	 * Student's AnswerSheet
	 */
	private AnswerSheet answerSheet = new AnswerSheet();

	/**
	 * 
	 * Constructor
	 *
	 */
	public Student() {}

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param paper
	 * @param answerSheet
	 */
	public Student(String name, Paper paper, AnswerSheet answerSheet)
	{
		super();
		this.name = name;
		this.paper = paper;
		this.answerSheet = answerSheet;
	}

	/**
	 * name.
	 * 
	 * @return  the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * name.
	 * 
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
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
	 * answerSheet.
	 * 
	 * @return  the answerSheet
	 */
	public AnswerSheet getAnswerSheet()
	{
		return answerSheet;
	}

	/**
	 * answerSheet.
	 * 
	 * @param answerSheet the answerSheet to set
	 */
	public void setAnswerSheet(AnswerSheet answerSheet)
	{
		this.answerSheet = answerSheet;
	}



}
