import java.lang.*;
import java.util.*;




public class TwoNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short a,b;
        a=sc.nextShort();
        b=sc.nextShort();
        System.out.printf("floor %d / %d = %d\n",a,b,(int)Math.floor((float)a/b));
        //type casting to float because java will produce an integer on 2 integer divisions
        System.out.printf("ceil %d / %d = %d\n",a,b,(int)Math.ceil((float)a/b));
        System.out.printf("round %d / %d = %d\n",a,b,Math.round((float)a/b));

    }
}