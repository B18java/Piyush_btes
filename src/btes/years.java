package btes;
import java.util.Scanner;

public class years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of days to be converted into years ,months and remaining days");
		int days=sc.nextInt();
		int months=days/30;
		int day=days%30;
		System.out.println(+months+" months and"+day+" days");

	}
}