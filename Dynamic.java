import java.util.Scanner;

class Dynamic
{
    public static void main(String[])
    {
        Scanner sobj = new Scanner(System.in);

        int lenght = 0;
        int Arr[];

        System.out.println("Enter the number of elements");
        lenght = sobj.nextInt();

        Arr = new int[lenght];
        if(Arr == null)
        {
            System.out.println("unable to allocate memory");
        }
        else 
        {
            System.out.println("memory gets successfully allocated");
        }

        Arr = null;
        System.gc();


    }
}