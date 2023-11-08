
import java.util.Scanner;

class FactorialDemo
{
     
    int factorial(int n)
    {
           if(n==1)
           {
              return 1;
           } 
           else  
           {
            return ( n*factorial (n-1));
           
           }
           
    }

     void user()
     {
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         System.out.println( " facat of 5 is : " +factorial(n));

     }

public static void main(String[] args)

 {  
    FactorialDemo fd=new FactorialDemo();
    System.out.println ("Factorial number of s is :");
     fd.user();
   
 }
}  