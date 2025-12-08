import java.lang.*;
import java.util.*;




public class SummationToN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n;
        n=sc.nextLong();
        long sum=(n*(n+1))/2;
        System.out.print(sum);

    }
}