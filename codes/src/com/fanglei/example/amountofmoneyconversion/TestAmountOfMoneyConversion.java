/**
 * Project Name: project_framework_design_java
 * File Name: TestAmountOfMoneyConversion.java
 * Package Name: com.fanglei.example.amountofmoneyconversion
 * Date: Jul 2, 2017 1:58:40 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.amountofmoneyconversion;

/**
 * ClassName: TestAmountOfMoneyConversion
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 1:58:40 PM
 */
public class TestAmountOfMoneyConversion
{
	public static void main(String[] args)
	{
		String money = "￥10121234353340011";
		String result = AmountOfMoneyConversion.convert(money);

		System.out.println("阿拉伯数字金额为: " + money);
		if((result == null) || (result.length()==0))
		{
			System.out.println("金额转换失败");
		}
		else {

			System.out.println("中文大写金额为: " + result);
		}
	}

}
