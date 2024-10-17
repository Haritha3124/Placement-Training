public class PrintNumbers {
    public static void main(String[] args) {
        int a=1234;
        while(a!=0){
            int b=a%10;
            System.out.println(b);
            a/=10;
        }
    }
}
