//Factorial calculation using recursion
//public class Factorial {
//    public static void main(String[] args){
//        int num = 4;
//        System.out.println(Fact_Calculation(num));
//    }
//    public static int Fact_Calculation(int a){
//        if(a == 0 || a == 1){
//            return 1;
//        }
//        return a * Fact_Calculation(a-1);
//    }
//}

//Factorial calculation using for loop
public class Factorial {
    public static void main(String[] args){
        int num = 4;
        int result = 1;
        for(int i = 1; i <= num; i++){
            result = result * i;
        }
        System.out.println(result);
    }
}

