/**
 * Project Name: project_framework_design_java
 * File Name: SingletonEnum.java
 * Package Name: com.fanglei.example.singleton
 * Date: Jun 30, 2017 10:03:06 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.singleton;

/**
 * ClassName: SingletonEnum
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 10:03:06 PM
 */
public enum SingletonEnum
{
	INSTANCE;

	private String name;

	/**
	 * name.
	 * 
	 * @return  the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * name.
	 * 
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	public void test()
	{
		System.out.println("The test!");
	}


}
