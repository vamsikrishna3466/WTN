package com.wipro.overridingandpolymorphism;
class Fruit
{
	protected String name;
	protected String taste;
	protected int size;
	void eat()
	{
		System.out.println("Name of the fruit "+name);
		System.out.println("taste of fruit "+taste);
	}
}
class Apple extends Fruit
{
	Apple(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	@Override
	void eat()
	{
		System.out.println("Apple");
		System.out.println("-------");
		System.out.println("Name of the fruit "+name);
		System.out.println("taste of fruit "+taste);
		System.out.println("size of fruit is "+size);
	}
}
class Orange extends Fruit
{
	Orange(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	@Override
	void eat()
	{
		System.out.println("Orange");
		System.out.println("-------");
		System.out.println("Name of the fruit "+name);
		System.out.println("taste of fruit "+taste);
		System.out.println("size of fruit is "+size);
	}
}
public class Ex1 {

	public static void main(String[] args)
	{
		Apple appleobject=new Apple("shimla apple ","sweet",5);
		appleobject.eat();
		Orange orangeobject=new Orange("naranja orange","sour and sweet",7);
		orangeobject.eat();
	}

}
