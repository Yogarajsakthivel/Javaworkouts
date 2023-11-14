class InheriTance
{
   void user()
   {
    System.out.print("Hi This is Yogi");
   }
}
class InheriTances extends InheriTance
{
    void userinfo()
   {
    super.user();
    System.out.print("I am worked as a Fullstack Developer");
   }
    public static void main (String args[])
    {
        InheriTances it = new InheriTances();
    
        it.userinfo();

    }
}