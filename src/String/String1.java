package String;

public class String1 {
	public static void main(String args[])
	{
		String s="how are you";
		String b="";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			b=b+a[i]+" ";
		}System.out.println(b);
	}

}
