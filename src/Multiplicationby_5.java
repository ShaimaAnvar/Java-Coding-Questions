public class Multiplicationby_5 {
    public static void main(String [] args){
        int result= multiply(5,10);
        System.out.println(result);
    }
    public static int multiply(int a, int b){
        int result=0;
        for(int i=0;i<b; i++ ){
            result=result+a;
        }
        return result;
    }
}

