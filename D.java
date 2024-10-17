//Leap year or not
public class D {
    public static void main(String[] args) {
        int n=2005;
        if(n%400==0){
            System.out.println("Year is Leap Year");
        }
        else if(n%4==0 && n%100!=0){
            System.out.println("Year is Leap Year");
        }
        else{
            System.out.println("Year is not a Leap Year");
        }
    }
}
