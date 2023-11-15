package Java;

import java.util.Scanner;

public class crocodile 
{

public static void main(String args[])

{
	
Scanner myTime=new Scanner(System.in);

System.out.println("Monkey is on the tree want to cross the river ");

System.out.println("crocodile is in the river");

System.out.println("monkey only cross the river when the crocodile is sleeping , crocodile sleep in the morning and evening");

System.out.println("Monkey crossing time is: ")	;

String time = myTime.next();

switch(time)

{
	case "morning" :

	System.out.println("Morning time now crocodile is sleeping so Monkey escaped");
	
	break;

	case "afternoon" :
		
	System.out.println("afternoon time now crocodile is awake so Monkey can't escape");
	
	break;
	
	case "evening" :
		
	System.out.println("Evening time now crocodile is sleeping so Monkey escaped");

     break;
     
	case "night" :
		
	System.out.println("night time now crocodile is awake so Monkey can't escape");
	
	break;
	
	default :
		 
		System.out.println("Invalid");


}
}
}



