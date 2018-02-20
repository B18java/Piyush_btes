package btes;
import java.util.Scanner;

public class A{

	A()
	{
		System.out.println("in parent class default constructor");
	}
	A(int x)
	{
		System.out.println("in parent class overloaded constructor");
	}
	void sum(int x,int y)
	{
		System.out.println("parent class method");
		System.out.println(x+y);
	}
	void display()
	{
		System.out.println("hello");
	}
	void show()
	{
		System.out.println("h");
	}
}
class B extends A
{
	B()
	{//super();
		System.out.println("in child class constructor");
	}
	B(String y)
	{
		System.out.println("in child class overloaded constructor");
	}

void show()
{
	System.out.println("hi");
}
}


	