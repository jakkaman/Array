public class InsertAtStartExample {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        int newElement = 1;
        int[] newArray = new int[numbers.length + 1];
        newArray[0] = newElement;
        for (int i = 0; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after inserting " + newElement + " at the start:");
        printArray(newArray);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

