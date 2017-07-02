/**
 * Project Name: project_framework_design_java
 * File Name: EinsteinLadderProblem.java
 * Package Name: com.fanglei.example.einsteinladderproblem
 * Date: Jul 2, 2017 9:24:17 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.einsteinladderproblem;

/**
 * ClassName: EinsteinLadderProblem
 * Description:
 * 爱因斯坦曾出过这样一道有趣的数学题：有一个长阶梯，每步上2阶，最后剩1阶；若每步上3阶，
 * 最后剩2阶；若每步上5阶，最后剩4阶；若每步上6阶，最后剩5阶；只有每步上7阶，
 * 最后一阶也不剩。请问该阶梯至少有多少阶。编写一个Java程序解决该问题。
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 9:24:17 PM
 */
public class EinsteinLadderProblem
{
	/**
	 * getLadderNumber
	 * 
	 * Get the min solution of Einstein ladder problem
	 * 
	 * @return
	 */
	public static int getLadderNumber()
	{
		int guess = 7;
		while(!(((guess %2) == 1) && ((guess % 3) == 2) && ((guess % 4) == 3) && ((guess % 5) == 4) && ((guess % 6) == 5)))
		{
			guess += 7;
		}
		return guess;
	}

}
