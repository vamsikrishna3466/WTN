package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {
	private DailyTasks dailytasksobject;
	@Before
	public void creation()
	{
		dailytasksobject=new DailyTasks();
	}
	@Test
	public void test() {
		assertEquals("vamsi krishna",dailytasksobject.doStringConcat("vamsi","krishna"));
	}
	
}
