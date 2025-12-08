import java.lang.*;
import java.util.*;
import javax.lang.model.util.ElementScanner14;




public class MaxMin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,min,max;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if( a>=b && a>=c)
        {
            max=a;   
        }
        else if(b>=c)
        {
            max=b;
        }
        else{
            max=c;
        }
        if( a<=b && a<=c)
        {
            min=a;   
        }
        else if(b<=c)
        {
            min=b;
        }
        else{
            min=c;
        }
        System.out.println(min+" "+max);

    }
}