/**
 * Project Name: project_framework_design_java
 * File Name: Palindrome.java
 * Package Name: com.fanglei.example.palindrome
 * Date: Jul 2, 2017 9:32:54 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.palindrome;

/**
 * ClassName: Palindrome
 * Description:
 * 有这样一类数字，它们顺着看和倒着看是相同的数，例如：121、656、2332等，
 * 这样的数字就称为回文数字。编写一个Java程序，判断从键盘接收的数字是否为回文数字。
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 9:32:54 PM
 */
public class Palindrome
{
	public static boolean isPalindrom(String number)
	{
		if ((number == null) || (number.length() == 0))
		{
			return false;
		}

		int len = number.length()/2;

		String start = number.substring(0, len);
		String end = number.substring((number.length() - len));
		for (int i = 0; i < start.length(); i ++)
		{
			if (start.charAt(i) != end.charAt(len - i - 1))
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrom(int number)
	{
		int parlindorm = 0;
		int temp = number;
		while(temp != 0)
		{
			parlindorm = (parlindorm*10) + (temp % 10);
			temp = temp / 10;
		}
		return (parlindorm == number) ? true: false;
	}

}
