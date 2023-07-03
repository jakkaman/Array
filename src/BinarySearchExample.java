public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] < target) {
                left = mid + 1; // Discard the left half of the array
            } else {
                right = mid - 1; // Discard the right half of the array
            }
        }

        return -1; // Return -1 if the target element is not found
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

