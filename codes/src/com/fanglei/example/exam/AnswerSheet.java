/**
 * Project Name: project_framework_design_java
 * File Name: AnswerSheet.java
 * Package Name: com.fanglei.example.exam
 * Date: Jul 6, 2017 9:37:48 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: AnswerSheet
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 6, 2017 9:37:48 PM
 */
public class AnswerSheet
{
	/**
	 * The answer sheet ID
	 */
	private String answerSheetId = "";

	/**
	 * Answer
	 */
	private Map<String, Integer> answers = new HashMap<String, Integer>();

	/**
	 * 
	 * Constructor
	 *
	 */
	public AnswerSheet(){}

	/**
	 * Constructor
	 * 
	 * @param answerSheetId
	 * @param answers
	 */
	public AnswerSheet(String answerSheetId, Map<String, Integer> answers)
	{
		super();
		this.answerSheetId = answerSheetId;
		this.answers = answers;
	}

	/**
	 * answerSheetId.
	 * 
	 * @return  the answerSheetId
	 */
	public String getAnswerSheetId()
	{
		return answerSheetId;
	}

	/**
	 * answerSheetId.
	 * 
	 * @param answerSheetId the answerSheetId to set
	 */
	public void setAnswerSheetId(String answerSheetId)
	{
		this.answerSheetId = answerSheetId;
	}

	/**
	 * answers.
	 * 
	 * @return  the answers
	 */
	public Map<String, Integer> getAnswers()
	{
		return answers;
	}

	/**
	 * answers.
	 * 
	 * @param answers the answers to set
	 */
	public void setAnswers(Map<String, Integer> answers)
	{
		this.answers = answers;
	}


}
