class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside Default Constructor");
    }
    public Demo(int i, int j)
    {
        System.out.println("Inside Parametrised Constructor");
    }
    protected void finalize() 
    {
        System.out.println("Inside finialize");
    }
}
class Constructordestructor
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo(); //Deo dobj();

        Demo dobj2 = new Demo(11,21); //Demo dobj(11,21);

        System.gc();
        System.out.println("End of mian");
    }
}