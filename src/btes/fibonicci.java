package btes;
import java.util.Scanner;

public class fibonicci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int f=0,s=1,t,i;
		System.out.println(+f+s);
		for(i=0;i<9;i++)
		{
			t=f+s;
			System.out.println(+t);
			f=s;
			s=t;
		}

	}

}
