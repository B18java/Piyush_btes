package btes;
import java.util.Scanner;

public class trioseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int f=0,s=1,t=1,fourth,i;
		System.out.println(+f+""+s+""+t);
		for(i=0;i<9;i++)
		{
			fourth=f+s+t;
			System.out.println(+fourth);
			f=s;
			s=t;
			t=fourth;
		}
         
	}

}
