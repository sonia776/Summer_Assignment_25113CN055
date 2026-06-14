public class Right_Rotated_Array {

     public static void main(String[] args) {
          int nums[] = { 1, 2, 7, 8, 9, 0 };

          int last = nums[nums.length - 1];

          for (int i = nums.length - 1; i > 0; i--) {
               nums[i] = nums[i - 1];
          }

          nums[0] = last;

          System.out.println("Right Rotated Array : ");
          for (int num : nums) {
               System.out.print(num + " ");
          }
     }
}
