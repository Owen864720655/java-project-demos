/**
 * Project Name: project_framework_design_java
 * File Name: TestStack.java
 * Package Name: com.fanglei.example.stack
 * Date: Jul 6, 2017 9:31:06 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.stack;

/**
 * ClassName: TestStack
 * Description:
 * 	Test the Stack
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 6, 2017 9:31:06 PM
 */
public class TestStack
{

	public static void main(String[] args)
	{
		Stack stack =  new Stack<>();
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		stack.push(new Integer(5));
		stack.push(new Integer(6));

		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
