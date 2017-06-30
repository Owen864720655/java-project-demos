/**
 * Project Name: project_framework_design_java
 * File Name: TestStringInterception.java
 * Package Name: com.fanglei.stringinterception
 * Date: Jun 29, 2017 10:34:16 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.stringinterception;

import java.util.Scanner;

/**
 * ClassName: TestStringInterception
 * Description:
 * 	Test the class StringInterception
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 29, 2017 10:34:16 PM
 */
public class TestStringInterception
{

	/** main
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("请输入字符串: ");
		@SuppressWarnings("resource")
		Scanner scannerString = new Scanner(System.in);
		String line = scannerString.next();

		System.out.println("请输入字节长度: ");
		@SuppressWarnings("resource")
		Scanner scannerByteNumber = new Scanner(System.in);
		int byteNumber = scannerByteNumber.nextInt();

		System.out.println("字符串的前" + byteNumber + "个字节为:");
		System.out.println(StringInterception.intercept(line, byteNumber));

		//		line = null;
		//		byteNumber = 5;
		//		System.out.println(StringInterception.intercept(line, byteNumber));


	}

}
