public class Largest_Number {
    public static void main(String[] args){
        int[] nums= {6,2,9,0,1};
        int max =nums[0];
        for(int num: nums){
                if(num>max){
                    max=num;
                }
        }
        System.out.println(max);
    }
}
