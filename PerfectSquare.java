public class PerfectSquare {
    static boolean isPerfectSquare(int x){
        if(x>=0){
            int a=(int)Math.sqrt(x);
            return((a*a)==x);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int x=84;
        if(isPerfectSquare(x)){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
    }
}
