import java.lang.*;
import java.util.*;



public class SimpleCalc{
    static long sum(long x,long y)
    {
       return x+y; 
    }
    static long multiplication(long x,long y)
    {
       return x*y; 
    }
    static long Difference(long x,long y)
    {
       return x-y; 
    }

    public static void main(String[] args)
    {
        long x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextLong();
        y=sc.nextLong();
        System.out.printf("%d + %d = %d\n",x,y,sum(x,y));
        System.out.printf("%d * %d = %d\n",x,y,multiplication(x, y));
        System.out.printf("%d - %d = %d",x,y,Difference(x, y));
    }
}