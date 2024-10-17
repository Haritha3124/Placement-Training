public class Reverse {
    public static void main(String[] args) {
        int x=1234,rev=0,num;
        while(x!=0){
            num=x%10;
            rev=rev*10+num;
            x=x/10;
        }
        System.out.println(rev);
    }
}
