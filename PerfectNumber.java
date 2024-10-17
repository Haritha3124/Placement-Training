public class PerfectNumber {
    public static void main(String[] args) {
        int x=6,sum=0;
        for(int i=1;i<x;i++){
           if(x%i == 0){
              sum+=i;
           }
        }
        if(sum==x){
            System.out.println("Number is Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
