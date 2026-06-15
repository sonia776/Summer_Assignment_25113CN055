public class Missing_Number {

    public static int MissingNo(int nums[]) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {

        int nums[] = { 0, 1, 2, 3, 4, 6, 7 };
        System.out.println(MissingNo(nums));
    }
}