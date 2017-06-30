/**
 * Project Name: project_framework_design_java
 * File Name: ConsoleIO.java
 * Package Name: com.fanglei.util
 * Date: Jun 30, 2017 9:17:01 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.util;

import java.util.Scanner;

/**
 * ClassName: ConsoleIO
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 9:17:01 PM
 */
public class ConsoleIO
{
	/**
	 * getStringFromConsole
	 * 
	 * Get one string-type line from the console
	 * 
	 * @return the STRING line
	 */
	public static String getStringFromConsole()
	{
		Scanner in = new Scanner(System.in);
		String line =  in.nextLine();
		in.close();
		return line;
	}

	/**
	 * getIntFromConsole
	 * 
	 * Get the number from the console
	 * 
	 * @return the INT number
	 */
	public static int getIntFromConsole()
	{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		in.close();
		return number;
	}
}
