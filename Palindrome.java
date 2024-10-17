public class Palindrome {
        public static void main (String[]a){
             int num=515,x=num,rev=0,rem;
             while(num!=0){
                 rem=num%10;
                 rev=rev*10+rem;
                 num=num/10;
             }
             if(x==rev){
                 System.out.println("Palindrome");
             }
             else{
                 System.out.println("Not a palindrome");
             }
        }
    }

