public class Sum_Of_Digits {
    public static void main(String[] args){
        int num = 123;
        int sum = findSumOfDigits(num);
    System.out.println("Input: "+ num + " Output: "+ sum);
    }
    public static int findSumOfDigits(int number){
        int sum =0;
        while(number > 0){
            int digit = number%10; //get the last digit
            sum += digit;          // add digit to the sum
            number = number/10;   //removes last digit
        }
        return sum;
    }
}
