public class Move_Zeroes {

     public static void main(String[] args) {
          int nums[] = { 0, 0, 7, 8, 9, 3 };

          int index = 0;

          for (int i = 0; i < nums.length; i++) {
               if (nums[i] != 0) {
                    if (i != index) {
                         int temp = nums[index];
                         nums[index] = nums[i];
                         nums[i] = temp;
                    }
                    index++;
               }
          }

          for (int num : nums) {
               System.out.print(num + " ");
          }
     }
}
