package btes;
import java.io.*;
import java.util.*;

public class Stringpallindrome {
	public static void main(String[]args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter string to check whether it is pallindrome or not");
		String s=br.readLine();
		String a="";
		for(int i=s.length();i>0;i--)
		{
			a=a+s.charAt(i);
		}
	
	if(s.equals(a))
	{
		System.out.println("pallindrome");
	}
	else
		System.out.println("not pallindrome");

}
}