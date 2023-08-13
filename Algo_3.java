import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[nums.length-i-1];
            
        }
        nums = temp;
        System.out.println(Arrays.toString(nums));
    }
}
