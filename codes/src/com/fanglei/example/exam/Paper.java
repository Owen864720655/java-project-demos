/**
 * Project Name: project_framework_design_java
 * File Name: Paper.java
 * Package Name: com.fanglei.example.exam
 * Date: Jul 6, 2017 9:37:28 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Paper
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 6, 2017 9:37:28 PM
 */
public class Paper
{
	/**
	 * The paper name
	 */
	private String paper = "";

	/**
	 * The questions in the paper
	 */
	private Map<String, Question> questions = new HashMap<String, Question>();

	/**
	 * 
	 * Constructor
	 *
	 */
	public Paper() {}

	/**
	 * Constructor
	 * 
	 * @param paper
	 * @param questions
	 */
	public Paper(String paper, Map<String, Question> questions)
	{
		super();
		this.paper = paper;
		this.questions = questions;
	}

	/**
	 * paper.
	 * 
	 * @return  the paper
	 */
	public String getPaper()
	{
		return paper;
	}

	/**
	 * paper.
	 * 
	 * @param paper the paper to set
	 */
	public void setPaper(String paper)
	{
		this.paper = paper;
	}

	/**
	 * questions.
	 * 
	 * @return  the questions
	 */
	public Map<String, Question> getQuestions()
	{
		return questions;
	}

	/**
	 * questions.
	 * 
	 * @param questions the questions to set
	 */
	public void setQuestions(Map<String, Question> questions)
	{
		this.questions = questions;
	}


}
