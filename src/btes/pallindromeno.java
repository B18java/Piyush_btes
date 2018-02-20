package btes;
import java.util.Scanner;

public class pallindromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number n to be reversed");
		int n=sc.nextInt();
		int r,rev=0;
		int s=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			 }
		if(rev==s)
		{
			
		
		System.out.println("pallindrome");

	}
		else
			System.out.println("not pallindrome");
	}

}