package btes;
import java.io.*;

public class employee {
	int emp_id;
	String emp_name;
	float salary;
	int emp_addr;
	String mob_no;
	final static String company="bebo";
	static InputStreamReader isr=new InputStreamReader(System.in);
	static BufferedReader br =new BufferedReader(isr);
	employee()throws IOException
	{
		System.out.println("enter id");
		emp_id=Integer.parseInt(br.readLine());
		System.out.println("enter name");
		emp_name=br.readLine();
				
				
	}
	void display()
	{
		System.out.println(emp_id);
		System.out.println(emp_name);
	}
	public static void main(String[]args)throws IOException
	{
		employee e1=new employee();
		employee e2=new employee();
		//employee e3=new employee();
		System.out.println("enter the emp_id to update");
		int id=Integer.parseInt(br.readLine());
		if(id==e1.emp_id)
			e1.update(e1);
		if(id==e2.emp_id)
			e2.update(e2);
		
			
	}
	void update(employee e)throws IOException
	{
		char choice='n';
		do
		{
			System.out.println("enter your choice for updation\n1.Name\n2.Designation");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
			case 1:
				System.out.println("enter new name");
				e.emp_name=br.readLine(); 
				break;
			case 2:
				System.out.println("enter new id");
						e.emp_id=Integer.parseInt(br.readLine());
						
			}
		}
	}

}
