public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        int maximum =0;
        int minimum =0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (maximum < num){
                maximum = num;
            }
            if(minimum > num){
                minimum = num;
            }
            
        }
        System.out.println("Largest number is "+maximum);
        System.out.println("Smallest number is "+minimum);
    }
}
