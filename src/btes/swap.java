package btes;
import java.util.Scanner;


public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter a");
int a=s.nextInt();
System.out.println("enter b");
int b=s.nextInt();
int temp=a;
a=b;
b=temp;
System.out.println("After swapping value of a and b is"+a+" "+b);
	}

}
