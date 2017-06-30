/**
 * Project Name: project_framework_design_java
 * File Name: Singleton.java
 * Package Name: com.fanglei.example.singleton
 * Date: Jun 30, 2017 9:48:33 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.singleton;

import java.io.Serializable;

/**
 * ClassName: Singleton
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 9:48:33 PM
 */
public class SingletonInnerClass implements Serializable
{
	// private constructor
	private SingletonInnerClass(){}

	// static inner class 被视作 top level 的 class 的一个 member ，和 field 和 method 一样
	private static class SingletonHolder
	{
		private static SingletonInnerClass instance = new SingletonInnerClass();
	}

	public static SingletonInnerClass getInstance()
	{
		return SingletonHolder.instance;
	}

	public Object readResolve()
	{
		return SingletonHolder.instance;
	}
}
