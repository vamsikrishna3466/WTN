package com.wipro.classesandobjects;
class Box
{
	double width;
	double height;
	double depth;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	double calculateVolume()
	{
		return width*depth*height;
	}
}
public class Exercise1 {

	public static void main(String[] args) {
		double width;
		double height;
		double depth;
		if(args.length<=2)
		{
			System.out.println("Number of parameters should be grater than 2");
		}
		else
		{
		width=Double.parseDouble(args[0]);
		height=Double.parseDouble(args[1]);
		depth=Double.parseDouble(args[2]);
		Box boxobject=new Box(width,height,depth);
		double volume=boxobject.calculateVolume();
		System.out.println("The volume of box is "+volume);
		}

	}

}
