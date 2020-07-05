package com.wipro.javaio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class Ex3 {
	public static void main(String[] args)
	{
		BufferedInputStream bfs=null;
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\javaio\\"+args[0]);
			bfs=new BufferedInputStream(fis);
			while(bfs.r)
			
		}
		
	}

}
