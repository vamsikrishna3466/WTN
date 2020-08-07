package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {
	private DailyTasks dailytasksobject;
	@Before
	public void creation()
	{
		dailytasksobject=new DailyTasks();
	}
	@Test
	public void test()
	{
		int []arr=new int[]{1,7,3,2,8};
		int []arr1=new int[] {1,2,3,7,8};
		assertArrayEquals(arr1,dailytasksobject.sortValues(arr));
	}

}
