import java.lang.*;
import java.util.*;




public class Difference{
    public static void main(String[] args) {
        long a,b,c,d,diff=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        diff=(a*b)-(c*d);
        System.out.print("Difference = "+diff);
    }
}