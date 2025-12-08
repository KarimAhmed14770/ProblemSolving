import java.lang.*;
import java.util.*;




public class Multiples{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if( a%b==0 || b%a==0)
        {
            System.out.print("Multiples");
        }
        else
        {
            System.out.print("No Multiples");
        }

    }
}