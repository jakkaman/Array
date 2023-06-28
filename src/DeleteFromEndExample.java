public class DeleteFromEndExample {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {1, 2, 3, 4, 5};

        // Create a new array with reduced length
        int[] newArray = new int[numbers.length - 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = numbers[i];
        }

        // Print the updated array
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after deleting element from the end:");
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

