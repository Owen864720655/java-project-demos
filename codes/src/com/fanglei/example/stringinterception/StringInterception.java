/**
 * Project Name: project_framework_design_java
 * File Name: StringInterception.java
 * Package Name: com.fanglei.stringinterception
 * Date: Jun 29, 2017 10:31:26 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.stringinterception;


/**
 * ClassName: StringInterception
 * Description:
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
 * 但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，输入"我ABC汉DEF"6，
 * 应该输出"我ABC"，而不是"我ABC+汉的半个"。 
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 29, 2017 10:31:26 PM
 */
public class StringInterception
{
	public static String REG_EX = "[\u4e00-\u9fa5]";

	/**
	 * interceptor
	 * 
	 * 
	 * @param line the sentence
	 * @param byteNumber the required byte number
	 * @return the splited string
	 */
	public static String intercept(String line, int byteNumber)
	{
		// Deal with the null pointer
		if((line == null))
		{
			return null;
		}

		// Count the bytes number
		int byteCnt = 0;

		for (int i = 0; i < line.length(); i ++)
		{
			if(line.substring(i, i + 1).matches(REG_EX))
			{
				// Chinese letter
				if ((byteCnt + 1) == byteNumber)
				{
					return line.substring(0, i);
				}
				else if ((byteCnt + 2) == byteNumber)
				{
					return line.substring(0, i + 1);
				}
				else {
					byteCnt += 2;
				}
			}
			else { // English letter
				if((byteCnt + 1) == byteNumber)
				{
					return line.substring(0, i+1);
				}
				else
				{
					byteCnt ++;
				}
			}
		}

		return line;
	}

}
