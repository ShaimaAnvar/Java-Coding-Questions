public class Smallest_Number {
    public static void main(String[] args){
        int[] nums = {4,1,-2,3,9,8};
        int min = nums[0];
        for(int num: nums){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
