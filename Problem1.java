
public class Problem1 {

    public int findTheMissing(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] != mid + 1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }
}