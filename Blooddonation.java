package Java;

import java.util.Scanner;

public class BloodDonation {
	
	void blood()
	
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your name  :");
		
		String name = sc.next();
		
		System.out.print("Enter Your Weight  :");
		
		int weight = sc.nextInt();
		
		if(weight>=50)
		{
			System.out.print(" You are Eligible for Blood donation");
			
		}
		else
		{
			System.out.println(" You are not Eligible for Blood donation");
		}
	}

	public static void main (String args[])

	{
        BloodDonation bd =new BloodDonation();
        bd.blood();
	}
}
