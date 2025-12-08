import java.lang.*;
import java.util.*;




public class DigitsSummation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x,y;
        x=sc.nextLong();
        y=sc.nextLong();
        byte x1,y1;
        x1=(byte)(x%10);
        y1=(byte)(y%10);
        System.out.print(x1+y1);


    }
}