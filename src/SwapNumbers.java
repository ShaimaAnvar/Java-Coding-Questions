
//Swap two numbers using temp variable
public class SwapNumbers {
    public static void main(String[] args){
        int a = 3, b = 2;
        int temp;
        temp = a;
        a = b;
        b = temp;
//Swap two numbers without using temp variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}


