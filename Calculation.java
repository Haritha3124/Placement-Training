
import java.util.Scanner;

public class Calculation {
    float a;
    float b;
    public static void main(String[] args) {
        Calculation ob = new Calculation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Value:");
        ob.a=sc.nextFloat();
        System.out.print("Enter 2rd value:");
        ob.b=sc.nextFloat();
        float c=ob.a+ob.b;
        System.out.print("Sum of two values:"+c);
    }
}
