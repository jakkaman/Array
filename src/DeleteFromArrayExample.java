public class DeleteFromArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int deleteIndex = 2;
        int[] newArray = new int[numbers.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            newArray[i] = numbers[i];
        }
        for (int i = deleteIndex + 1; i < numbers.length; i++) {
            newArray[i - 1] = numbers[i];
        }
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after deleting element at index " + deleteIndex + ":");
        printArray(newArray);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

