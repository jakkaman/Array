public class InsertAnywhereExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5};
        int newElement = 3;
        int insertPosition = 2;
        int[] newArray = new int[numbers.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == insertPosition) {
                newArray[i] = newElement;
                j--;
            } else {
                newArray[i] = numbers[j];
            }
        }
        System.out.println("Original array:");
        printArray(numbers);
        System.out.println("\nNew array after inserting " + newElement + " at position " + insertPosition + ":");
        printArray(newArray);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

