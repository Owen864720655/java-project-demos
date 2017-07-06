/**
 * Project Name: project_framework_design_java
 * File Name: TestDaffodilsNumber.java
 * Package Name: com.fanglei.example.daffodilsnumber
 * Date: Jul 2, 2017 10:16:15 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.daffodilsnumber;

import java.util.ArrayList;

/**
 * ClassName: TestDaffodilsNumber
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 10:16:15 PM
 */
public class TestDaffodilsNumber
{

	public static void main(String[] args)
	{
		System.out.println("打印所有的水鲜花数字：");
		ArrayList<Integer> integers = DaffodilsNumber.getDaffodilsNumber();
		System.out.println(integers.toString());
	}

}
