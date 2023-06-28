public class InsertAtEndExample {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {1, 2, 3, 4, 5};

        // New element to insert
        int newElement = 6;

        // Create a new array with increased length
        int[] newArray = new int[numbers.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }

        // Insert the new element at the end of the new array
        newArray[newArray.length - 1] = newElement;

        // Print the updated array
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after inserting " + newElement + " at the end:");
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

