public class Left_Rotated_Array {

     public static void main(String[] args) {
          int nums[] = {1,2,7,8,9,0};
          
           int start = nums[0];

           for(int i = 0 ; i<nums.length -1; i++){
               nums[i] = nums[i+1];
           }

           nums[nums.length-1] = start ;

          
          System.out.println("Left Rotated Array : ");
          for(int num : nums){
               System.out.print(num + " ");
          }
}
}