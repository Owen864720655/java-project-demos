/**
 * Project Name: project_framework_design_java
 * File Name: TestGoldbackGuess.java
 * Package Name: com.fanglei.example.goldbachguess
 * Date: Jun 30, 2017 10:44:08 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.goldbachguess;

/**
 * ClassName: TestGoldbackGuess
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 10:44:08 PM
 */
public class TestGoldbackGuess
{

	public static void main(String[] args)
	{
		int maxNum = 100000;
		GoldbackGuess goldbackGuess = new GoldbackGuess(maxNum);

		System.out.println("验证哥德巴赫猜想(上限为" + maxNum + ")");

		boolean result = goldbackGuess.checkGoldbackGuess();
		System.out.println("结果为：" + result);
	}
}
