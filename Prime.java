public class Prime {
    public static void main(String[] args) {
        int x=10,count=0;
        if(x<1){
            System.out.println("Not a Prime");
        }
        else{
            for(int i=1;i<x;i++){
                if(x%i==0){
                    count+=i;
                }
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
