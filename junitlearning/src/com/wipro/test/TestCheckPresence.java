package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence 
{
	private DailyTasks dailytasksobject;
	@Before
	public void creation()
	{
		dailytasksobject=new DailyTasks();
	}

	@Test
	public void test1() 
	{
		assertTrue(dailytasksobject.checkPresence("vamsi krishna","krish"));
	}
	@Test
	public void test2()
	{
		assertFalse(dailytasksobject.checkPresence("vamsi krishna","vamk"));
	}

}
