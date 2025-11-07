 abstrcat class Base
{
    public int i,j;
   public int Adddition(int a, int b)
   {
      return a + b;   }
    abstrcat public int Substraction(int a, int b);
}
class Derived extends Base
{
   public int Substraction(int a, int b)
   {
      return a-b;
   }
   public int Multiplication(int a, int b);
   {
      return 0;
   }
}
class Abstractdemo3
{
    public static void main(String A[])
    {
        Base bp = new Derived();
        int iRet = 0;

        iRet = bp.Adddition(11,10);
        iRet = bp.Substraction(11,10);
        iRet = bp.Multiplication(11,10);

    }
}