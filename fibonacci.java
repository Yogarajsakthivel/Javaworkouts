import java.util.Scanner;

class Fibonacci
{

void userInfo()
    {
        Scanner sc = new Scanner(System.in);
        
         int n1=0,n2=1,n3,i;
        System.out.println("Enter the number"); 
       int a = sc.nextInt();
        
    for (i=0;i<a;i++)
    {
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
    
    }
       
}
    public static void main ( String args[])
    {
         Fibonacci fc = new  Fibonacci();
         fc. userInfo();
    }
    }