package String;

public class Stringrevatsameplace {
	public static void main(String args[])
	{
		String a="how are you";
		String b="";
		String c="";
		 int j=0;
		for(int i=0;i<a.length()-1;i++)
		{
			if((a.charAt(i)==' ')||i==a.length()-1) {
				if(i==a.length()-1)
					b=b+a.substring(j,i+1);
				else
				b=b+a.substring(j,i); 
			}
			
			
		}
		System.out.println(b);
	}

}
