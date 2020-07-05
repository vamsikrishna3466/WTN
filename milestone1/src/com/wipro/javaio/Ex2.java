package com.wipro.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) throws IOException 
	{
		String inputfilename;
		String outputfilename;
		FileReader fr=null;
		FileWriter fw=null;
		System.out.println("Enter the input file name");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
		inputfilename=bf.readLine();
		System.out.println("Enter the output file name");
		outputfilename=bf.readLine();
		try
		{
			fr=new FileReader("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\javaio\\"+inputfilename);
			fw=new FileWriter("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\javaio\\"+outputfilename);
			int ch;
			while((ch=fr.read())!=-1)
			{
			fw.write((char)ch);	
			}
			System.out.println("File is copied");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			fr.close();
			fw.close();
			bf.close();
		}
	}

}
