public class InsertAnywhereExample {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {1, 2, 4, 5};

        // New element to insert
        int newElement = 3;

        // Position to insert the new element (0-based index)
        int insertPosition = 2;

        // Create a new array with increased length
        int[] newArray = new int[numbers.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == insertPosition) {
                newArray[i] = newElement;
                j--;
            } else {
                newArray[i] = numbers[j];
            }
        }

        // Print the updated array
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after inserting " + newElement + " at position " + insertPosition + ":");
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

