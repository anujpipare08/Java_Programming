class Demo implements Cloneable
{
    public int i;
    public int j;

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String A[])
    {
        try
        {
        Demo dobj1 = new Demo(11,21);
        Demo dobj = dobj1.clone();

        System.out.println(dobj2.i);
        System.out.println(dobj2.i);
        }
        catch(CloneNotSupportedException cobj)
        {}
    }

}