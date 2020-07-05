package com.wipro.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException
	{
		String filename;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the file name");
		filename=s.next();
		System.out.println("Enter the character to be counted");
		FileReader fr = null;
		String letter=s.next();
		try {
			int c=0;
			fr=new FileReader("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\javaio\\"+filename);
			int ch;
			while((ch=fr.read())!=-1)
			{
				if(letter.equalsIgnoreCase(((char)ch)+""))
					c++;
			}
			System.out.println(String.format("File '%s' has %d instances of letter '%s'",filename,c,letter));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			fr.close();
		}
		
		
	}

}
