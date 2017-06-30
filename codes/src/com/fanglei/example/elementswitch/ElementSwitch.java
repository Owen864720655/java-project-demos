/**
 * Project Name: project_framework_design_java
 * File Name: ElementSwitch.java
 * Package Name: com.fanglei.example.elementswitch
 * Date: Jun 30, 2017 9:27:13 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.elementswitch;

import java.util.Scanner;


/**
 * ClassName: ElementSwitch
 * Description:
 * 从键盘上输入10个整数，并将其放入一个一维数组中，然后将其前5个元素与后5个元素对换，
 * 即：第1个元素与第10个元素互换，第2个元素与第9个元素互换…第5个元素与第6个元素互换。
 * 分别输出数组原来各元素的值和对换后各元素的值。
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 9:27:13 PM
 */
public class ElementSwitch
{
	/**
	 * 元素总个数
	 */
	public static int elementSize = 10;

	/**
	 * switchElement
	 * switch the first num elements with the last num ones
	 * 
	 * @param array the element array
	 * @param num the size
	 */
	public static void switchElement(int[] array, int num)
	{
		int len = array.length;
		num = Math.min(num, len);

		int temp;
		len = len - 1;
		for(int i = 0; i <num; i++)
		{
			temp = array[i];
			array[i] = array[len - i];
			array[len - i] = temp;
		}
	}

	/**
	 * getArray
	 * 
	 * Get the array from the console
	 * @return
	 */
	public static int[] getArray()
	{
		Scanner in = new Scanner(System.in);
		int[] array = new int[elementSize];

		for (int i = 0; i < elementSize; i ++)
		{
			System.out.println("总共" + elementSize + "个元素，请输入第" + (i+1) + "个元素");
			array[i] = in.nextInt();
		}
		in.close();
		return array;
	}
}
