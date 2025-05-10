public class PrimeCheck {
    public static void main(String[]args){
        int val = 13;
        boolean isPrime = true;
        for(int i = 2; i <val/2; i++){
            if(val % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("Not a Prime");
        }
    }
}
