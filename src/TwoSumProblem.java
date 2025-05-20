public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        boolean found = false; // to avoid multiple prints if needed

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Output: [" + nums[i] + ", " + nums[j] + "]");
                    found = true;
                    break; // break inner loop
                }
            }
            if (found) {
                break; // break outer loop
            }
        }
    }
}
