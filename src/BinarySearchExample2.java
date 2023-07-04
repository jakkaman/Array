public class BinarySearchExample2 {
    
    public static int binarySearch(int[] nums, int target)
    {
        if(nums == null || nums.length == 0)
        return -1;

        int left = 0, right = nums.length - 1;
        while(left < right){
        // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid; }
        }
        // Post-processing:
        // End Condition: left == right
        if(nums[left] == target) return left;
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

