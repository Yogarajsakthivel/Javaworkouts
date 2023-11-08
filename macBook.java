class OddEven
{
    void userInfo()
    {
        for(int i=0;i<=30;i++)
        if(i%2==0)
        {
         System.out.println("The given number " + i + " is even");
        }
        else 
        {
         System.out.println("The given number " + i +  "is odd");

        }
    }
    public static void main (String args[])
    {
        OddEven od = new OddEven();
        od.userInfo();
    }
}

