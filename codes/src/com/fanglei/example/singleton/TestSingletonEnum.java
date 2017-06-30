/**
 * Project Name: project_framework_design_java
 * File Name: TestSingletonEnum.java
 * Package Name: com.fanglei.example.singleton
 * Date: Jun 30, 2017 10:08:44 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.singleton;

/**
 * ClassName: TestSingletonEnum
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 10:08:44 PM
 */
public class TestSingletonEnum
{

	/** main
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		SingletonEnum one = SingletonEnum.INSTANCE;
		SingletonEnum two = SingletonEnum.INSTANCE;


		one.test();
		one.setName("I am a [" + SingletonEnum.class + "] Instance");
		System.out.println(one.getName());

		if (one == two) {
			System.out.println("There are same");
		}
	}
}
