package btes;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter string to be reversed");
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	String p=sb.toString();
	if(s.equals(p))
	{
	System.out.println("pallindrome");
		

	}
	else
	{
		System.out.println("not pallindrome");
	}

}
}
