import java.util.*;
public class Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        // a[0]=1;
        // a[1]=2;
        // a[3]=3;
        // a[2]=4;
        // a[4]=5;
        // System.out.println("the  values are " +a[0]+" "+a[1]+" "+a[2]);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();//integer is well defined class in java
        }
        for(int i=0;i<=5;i++){
            System.out.println(a[i]);//if i=1 ,it throws out of bound error
        }
    }

}
