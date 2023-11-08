abstract class Remote
{
    abstract int userdef();
}

class TVRemote extends Remote
{

    int userdef(int a , int b)
    {
        int c = a+b;
        System .out.println(c);
        return 0;
    }


    void userinfo()
    {
        int a= 10;
        int b= 20;
        int c = userdef(a,b);

  }

public static void main (String args[])
  {
      TVRemote tv = new TVRemote();
      tv.userinfo();
  
  }
     
      }