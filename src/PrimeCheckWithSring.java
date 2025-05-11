public class PrimeCheckWithSring {
    public static void main(String[]args){
        int val = 10;
        String result = "Not a Prime";
        for(int i = 2; i <val/2; i++){
            if(val % i == 0) {
                result = "Not a prime";
                break;
            } else {
                result = "Prime";
            }
        }
        System.out.println(result);
    }
}
