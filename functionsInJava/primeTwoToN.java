public class primeTwoToN {
    public static void primeTillN(int n){

        for(int i =2; i<=n; i++){
            boolean isPrime = true;
            for(int d =2; d<i; d++){
                if(i%d==0){
                    isPrime = false;
                }
            }
            if(isPrime){
            System.out.println(i);
        }
        }
    } 
    public static void main(String[] args) {
        primeTillN(10);
    }   
}
