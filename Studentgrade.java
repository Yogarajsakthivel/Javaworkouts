package Java;

import java.util.Scanner;

public class Mark {
	
	void blood()
	
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your name  :");
		
		String name = sc.next();
		
		System.out.print("Enter Your Mark  :");
		
		int Mark = sc.nextInt();
		
		if(Mark>=90 && 90<=100)
		{
			System.out.print(" Your Grade is  A");
			
		}
		else if(Mark>=80 && 80<90)
		{
			System.out.print(" Your Grade is  B");
		}
		
		else if(Mark>=70 && 70<80)
		{
			System.out.print(" Your Grade is  C");
		
	     }
		else if (Mark>=60 && 60<70)
		{
			System.out.print(" Your Grade is  D");
		
	     }
		else if (Mark>=50 && 50<60)
		{
			System.out.print(" Your Grade is  E");
		
	     }
		else
		{
			System.out.print(" You are Fail");
		
	     }
	}

	public static void main (String args[])

	{
        Mark mk =new Mark();
        mk.blood();
	}
}
