/**
 * Project Name: project_framework_design_java
 * File Name: Question.java
 * Package Name: com.fanglei.example.exam
 * Date: Jul 6, 2017 9:37:41 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.exam;

import java.util.ArrayList;

/**
 * ClassName: Question
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 6, 2017 9:37:41 PM
 */
public class Question
{
	/**
	 * Question ID
	 */
	private String questionId = "";

	/**
	 * Question description
	 */
	private String questionDescription = "";

	private Integer score = new Integer(0);
	/**
	 * Question options
	 */
	private ArrayList<String> options = new ArrayList<String>();

	/**
	 * Question's right answer
	 */
	private Integer answer = new Integer(0);

	/**
	 * 
	 * Constructor
	 *
	 */
	public Question(){}

	/**
	 * Constructor
	 * 
	 * @param questionId
	 * @param questionDescription
	 * @param score
	 * @param options
	 * @param answer
	 */
	public Question(String questionId, String questionDescription,
			Integer score, ArrayList<String> options, Integer answer)
	{
		super();
		this.questionId = questionId;
		this.questionDescription = questionDescription;
		this.score = score;
		this.options = options;
		this.answer = answer;
	}



	/**
	 * score.
	 * 
	 * @return  the score
	 */
	public Integer getScore()
	{
		return score;
	}



	/**
	 * score.
	 * 
	 * @param score the score to set
	 */
	public void setScore(Integer score)
	{
		this.score = score;
	}



	/**
	 * answer.
	 * 
	 * @param answer the answer to set
	 */
	public void setAnswer(Integer answer)
	{
		this.answer = answer;
	}



	/**
	 * questionId.
	 * 
	 * @return  the questionId
	 */
	public String getQuestionId()
	{
		return questionId;
	}

	/**
	 * questionId.
	 * 
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(String questionId)
	{
		this.questionId = questionId;
	}

	/**
	 * questionDescription.
	 * 
	 * @return  the questionDescription
	 */
	public String getQuestionDescription()
	{
		return questionDescription;
	}

	/**
	 * questionDescription.
	 * 
	 * @param questionDescription the questionDescription to set
	 */
	public void setQuestionDescription(String questionDescription)
	{
		this.questionDescription = questionDescription;
	}

	/**
	 * options.
	 * 
	 * @return  the options
	 */
	public ArrayList<String> getOptions()
	{
		return options;
	}

	/**
	 * options.
	 * 
	 * @param options the options to set
	 */
	public void setOptions(ArrayList<String> options)
	{
		this.options = options;
	}

	/**
	 * answer.
	 * 
	 * @return  the answer
	 */
	public int getAnswer()
	{
		return answer;
	}

	/**
	 * answer.
	 * 
	 * @param answer the answer to set
	 */
	public void setAnswer(int answer)
	{
		this.answer = answer;
	};


}
