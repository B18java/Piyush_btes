package btes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;


public class strreverse {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String a="hello";
		String b="";
	 for(int i=a.length();i>0;i--)
	 {
		 b=b+a.charAt(i);
		
	 }
	 System.out.println(b);
	 

	}

}
