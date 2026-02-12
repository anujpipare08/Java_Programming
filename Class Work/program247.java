// Hello
// H    e   l   l   0
import java.util.*;
import javax.tools.SimpleJavaFileObject;
class program247
{
    public static void main(String A[])
    {
        int iCnt = 0;
       Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String sobj = scanobj.nextLine();

        char Arr[] = sobj.toCharArray();
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
        System.err.println(Arr[iCnt]);
        }
    }
}