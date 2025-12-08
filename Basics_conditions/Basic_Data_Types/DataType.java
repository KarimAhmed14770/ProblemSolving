import java.lang.*;
import java.util.*;


public class DataType{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        long l;
        char c;
        float f;
        double d;
        i=sc.nextInt();
        l=sc.nextLong();
        c=sc.next().charAt(0); //to read a single character using java
        f=sc.nextFloat();
        d=sc.nextDouble();

        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
    }
}
