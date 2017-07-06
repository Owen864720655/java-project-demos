/**
 * Project Name: project_framework_design_java
 * File Name: Stack.java
 * Package Name: com.fanglei.example.stack
 * Date: Jul 6, 2017 9:14:56 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Stack
 * Description:
 * Realization of a stack
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @param <E>
 * @date: Jul 6, 2017 9:14:56 PM
 */
public class Stack<E>
{
	/**
	 * A list
	 */
	private List<E> list = new ArrayList<E>();

	/**
	 * empty
	 * 
	 * Is the list empty
	 * 
	 * @return
	 */
	public boolean empty()
	{
		return list.isEmpty();
	}

	/**
	 * peek
	 * 
	 * return the top element
	 * 
	 * @return
	 */
	public E peek()
	{
		E e = list.get(0);
		return e != null ? e: null;
	}

	/**
	 * pop
	 * 
	 * remove and return the top element
	 * 
	 * @return
	 */
	public E pop()
	{
		E e = list.remove(0);
		return e != null ? e :null;
	}

	/**
	 * push
	 * 
	 * put the element into the stack
	 * 
	 * @param item
	 */
	public void push(E item)
	{
		list.add(item);
	}

	/**
	 * search
	 * 
	 * Search the index of the item in the stack
	 * 
	 * @param item
	 * @return
	 */
	public int search(E e)
	{
		return list.indexOf(e);
	}

}
