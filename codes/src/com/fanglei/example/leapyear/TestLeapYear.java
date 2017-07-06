/**
 * Project Name: project_framework_design_java
 * File Name: TestLeapYear.java
 * Package Name: com.fanglei.example.leapyear
 * Date: Jul 2, 2017 10:04:01 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.leapyear;

import com.fanglei.util.ConsoleIO;

/**
 * ClassName: TestLeapYear
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 10:04:01 PM
 */
public class TestLeapYear
{
	public static void main(String[] args)
	{
		System.out.println("请输入一个年份：");

		int year = ConsoleIO.getIntFromConsole();
		boolean result = LeapYear.check(year);
		System.out.println("是否是闰年：");
		System.out.println(result);
	}

}
