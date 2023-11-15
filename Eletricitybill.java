package Java;

import java.util.Scanner;

public class Electricity {

	void Ebill()
	{
		
		long units;
		
		double 	billPay=0;
		
		
		Scanner sd = new Scanner(System.in);
		
		System.out.println("Enter the units :");
		   
	       units =sd.nextInt();
		
		if(units < 300)  
        {  
            billPay = units * 1.20; 
            System.out.println("The electricity bill for " +units+ " is : free"); 
        }  
	    else if(units < 300)
	    {  
            billPay = 100 * 1.20 + (units - 100) * 2;  
            System.out.println("The electricity bill for " +units+ " is : free"); 
        }  

       
        else if(units >300)  
        {  
            billPay =(units - 300) * 3;  
        } 
		
        System.out.println("The electricity bill for " +units+ " is : " + billPay);   
      } 
	
	public static void main (String args[])
	{
		Electricity eb = new Electricity ();
		eb.Ebill();
	}
	} 
	
