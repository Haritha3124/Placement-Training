public class RangeOfPrime {
    public static void main(String[] args) {
        int x=10,y=20, count=0;

        for(int i=x;i<=y;i++){
                if(x%i==0){
                    count+=i;
                }
            }
        if(count<2){
            System.out.println("Not a prime");
        }
        else{
            System.out.println("Prime ");
        }
    }
}
//doubt
