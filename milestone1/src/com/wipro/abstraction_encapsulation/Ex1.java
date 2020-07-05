package com.wipro.abstraction_encapsulation;
class Author
{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}

public class Ex1 {

	public static void main(String[] args) {
	Author authorobject=new Author("vamsi","vamsikrishna3466@gmail.com",'M');
	Book bookobject=new Book("The Life",authorobject,756.23,20);
	bookobject.setName("The Long Life");
	System.out.println("Book Details");
	System.out.println("------------");
	System.out.println("Name of book "+bookobject.getName());
	System.out.println("price of book "+bookobject.getPrice());
	System.out.println("No of books in stock "+bookobject.getQtyInStock());
	System.out.println("Author Details");
	System.out.println("------------");
	System.out.println("Author name is "+bookobject.getAuthor().getName());
	System.out.println("Author email is "+bookobject.getAuthor().getEmail());
	System.out.print("Author gender is ");
	char authorGender=bookobject.getAuthor().getGender();
	if(authorGender=='M')
	{
		System.out.println("Male");
	}
	else
	{
		System.out.println("Female");
	}
	}
}
