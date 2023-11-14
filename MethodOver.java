class MethodOver
{
    String talk()
    {
        System.out.print("Hello");
        return " ";

    }  
 
    void yogi()
    {
        String name = "Yogi";

        System.out.print(talk()+ " " +name);

    }  
    public static void main(String[] args)
    
    {
       MethodOver mo = new  MethodOver();
       mo.yogi();
    }
}