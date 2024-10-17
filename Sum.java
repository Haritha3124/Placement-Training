//sum of numbers in given range
public class Sum {
    public static void main(String[] args) {
        int m=4;
        int n=7;
        // int sum=0;
        // for(int i=m;i<=n;i++){
        //      sum+=i;
        // }
        int sum=n*(n+1)/2 - m*(m+1)/2 + m;
        System.out.println(sum);

    }
    
}
