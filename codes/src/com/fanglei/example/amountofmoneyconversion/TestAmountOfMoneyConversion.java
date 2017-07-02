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

	/** main
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		String money = "￥10121234353340011";
		AmountOfMoneyConversion.init();
		String result = AmountOfMoneyConversion.convert(money);

		System.out.println("阿拉伯数字金额为: " + money);

		System.out.println("中国大写金额为: " + result);
	}

}
