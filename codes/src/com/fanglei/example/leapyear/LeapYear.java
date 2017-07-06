/**
 * Project Name: project_framework_design_java
 * File Name: LeapYear.java
 * Package Name: com.fanglei.example.leapyear
 * Date: Jul 2, 2017 10:01:05 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.leapyear;

/**
 * ClassName: LeapYear
 * Description:
 * 编写程序，判断给定的某个年份是否是闰年。
 *	闰年的判断规则如下：
 *	（1）若某个年份能被4整除但不能被100整除，则是闰年。
 * 	（2）若某个年份能被400整除，则也是闰年。
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 10:01:05 PM
 */
public class LeapYear
{
	public static boolean check(int year)
	{
		if ((year % 400) == 0)
		{
			return true;
		}
		if (((year % 4) == 0) && ((year % 100) > 0) )
		{
			return true;
		}
		return false;
	}
}
