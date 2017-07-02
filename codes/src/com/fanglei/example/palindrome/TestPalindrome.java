/**
 * Project Name: project_framework_design_java
 * File Name: TestPalindrome.java
 * Package Name: com.fanglei.example.palindrome
 * Date: Jul 2, 2017 9:42:30 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.palindrome;

import com.fanglei.util.ConsoleIO;


/**
 * ClassName: TestPalindrome
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 9:42:30 PM
 */
public class TestPalindrome
{
	public static void main(String[] args)
	{
		System.out.println("请输入一个数字以判断是否为回文数字：");
		int number = ConsoleIO.getIntFromConsole();
		boolean result = Palindrome.isPalindrom(number);
		System.out.println("是否是回文数字(通过int类型判断方法）：");
		System.out.println(result);

		result = Palindrome.isPalindrom("" + number);
		System.out.println("是否是回文数字(通过String类型判断方法）：");
		System.out.println(result);
	}
}
