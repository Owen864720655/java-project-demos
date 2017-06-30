/**
 * Project Name: project_framework_design_java
 * File Name: TestElementSwitch.java
 * Package Name: com.fanglei.example.elementswitch
 * Date: Jun 30, 2017 9:27:26 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.elementswitch;

import java.util.Arrays;


/**
 * ClassName: TestElementSwitch
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 9:27:26 PM
 */
public class TestElementSwitch
{

	public static void main(String[] arg)
	{
		int[] array = ElementSwitch.getArray();
		System.out.println("交换前的数组为：");
		System.out.println(Arrays.toString(array));

		int num = 5;
		ElementSwitch.switchElement(array, num);
		System.out.println("交换后的数组为：");
		System.out.println(Arrays.toString(array));
	}
}
