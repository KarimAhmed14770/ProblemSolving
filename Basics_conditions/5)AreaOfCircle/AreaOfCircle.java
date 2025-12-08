import java.lang.*;
import java.util.*;




public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi=3.141592653f;
        float radius=sc.nextFloat();
        double Area=pi*radius*radius;
        System.out.printf("%.9f",Area);

    }
}