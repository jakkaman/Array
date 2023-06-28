public class DeleteFromArrayExample {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {1, 2, 3, 4, 5};

        // Index of the element to delete
        int deleteIndex = 2;

        // Create a new array with reduced length
        int[] newArray = new int[numbers.length - 1];

        // Copy elements before the delete index from the original array to the new array
        for (int i = 0; i < deleteIndex; i++) {
            newArray[i] = numbers[i];
        }

        // Copy elements after the delete index from the original array to the new array
        for (int i = deleteIndex + 1; i < numbers.length; i++) {
            newArray[i - 1] = numbers[i];
        }

        // Print the updated array
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after deleting element at index " + deleteIndex + ":");
        printArray(newArray);
    }

    // Helper method to print an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

