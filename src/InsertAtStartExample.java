public class InsertAtStartExample {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {2, 3, 4, 5};

        // New element to insert
        int newElement = 1;

        // Create a new array with increased length
        int[] newArray = new int[numbers.length + 1];

        // Insert the new element at the beginning of the new array
        newArray[0] = newElement;

        // Copy elements from the original array to the new array
        for (int i = 0; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }

        // Print the updated array
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after inserting " + newElement + " at the start:");
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

