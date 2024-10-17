//Positive or Negative
class A{
    public static void main(String[]args){
        int n=0;
        /*if(n>0){
            System.out.println("given number is Positive");
        }
        else if(n<0){
            System.out.println("Given number is Negative");
        }
        else{
            System.out.println("Given number is Zero");
        }*/
        /*if (n>=0){
            if(n==0){
                System.out.println("Number is Zero");
            }
            else{
                System.out.println("Number is Positive");
            }
        }
        else{
            System.out.println("Number is negative");
        }*/
        System.out.println(n>0 ? "Number is positive": n==0 ? "Number is Zero" : "Number is Negative");
    }
}
