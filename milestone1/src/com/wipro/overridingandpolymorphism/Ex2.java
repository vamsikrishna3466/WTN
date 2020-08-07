package com.wipro.overridingandpolymorphism;
class Shape
{
	void draw()
	{
		System.out.println("Drawing ");
	}
	void erase()
	{
		System.out.println("Erasing ");
	}
}
class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Circle");
	}	
}
class Triangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Triangle ");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Triangle");
	}	
}
class Square extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing  Square");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Square");
	}	

}
public class Ex2 {

	public static void main(String[] args) 
	{
			Shape c=new Circle();
			c.draw();
			c.erase();
			Shape t=new Triangle();
			t.draw();
			t.erase();
			Shape s=new Square();
			s.draw();
			s.erase();	
	}

}
