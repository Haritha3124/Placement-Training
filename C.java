//Greatest Of three Numbers
public class C {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int c=3;
        if(a>b && a>c){
            System.out.println("A is greater");
        }
        else if(b>a && b>c){
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}