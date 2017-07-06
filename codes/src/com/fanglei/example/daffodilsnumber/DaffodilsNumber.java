/**
 * Project Name: project_framework_design_java
 * File Name: DaffodilsNumber.java
 * Package Name: com.fanglei.example.daffodilsnumber
 * Date: Jul 2, 2017 10:10:01 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.daffodilsnumber;

import java.util.ArrayList;

/**
 * ClassName: DaffodilsNumber
 * Description:
 * 输出所有的水仙花数，把谓水仙花数是指一个数3位数，其各各位数字立方和等于其本身， 
   例如： 153 = 1*1*1 + 3*3*3 + 5*5*5

 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 10:10:01 PM
 */
public class DaffodilsNumber
{
	public static ArrayList<Integer> getDaffodilsNumber()
	{
		ArrayList<Integer> integers = new ArrayList<Integer>();
		int i, j, k;
		for (int number = 100; number < 1000; number ++)
		{
			i = number % 10;
			j = (number / 10) %10;
			k = (number / 100);
			if(((i*i*i) + (j*j*j) + (k*k*k)) == number)
			{
				integers.add(number);
			}
		}
		return integers;
	}
}
