package com.wipro.inheritance;

class Animal
{
void eat()
{
System.out.println("I am eating ");
}
void sleep()
{
System.out.println("I am sleeping ");
}
}
class Bird extends Animal
{
	@Override
void eat()
{
System.out.println("Bird is eating");
}
	@Override
void sleep()
{
System.out.println("Bird is sleeping");
}
void fly()
{
System.out.println("Bird is flying");
}
}
public class Ex1
{
public static void main(String arg[])
{
Animal animalobject=new Animal();
animalobject.eat();
animalobject.sleep();
Bird birdobject=new Bird();
birdobject.eat();
birdobject.sleep();
birdobject.fly();
}
}
