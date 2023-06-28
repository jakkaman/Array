public class ArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing an integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing and printing elements of the array
        System.out.println("Elements of the numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Declaring and initializing a string array
        String[] names = {"John", "Mary", "Alex"};

        // Accessing and printing elements of the array
        System.out.println("\nElements of the names array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Declaring an array without initialization
        double[] values = new double[5];

        // Initializing array elements individually
        values[0] = 1.1;
        values[1] = 2.2;
        values[2] = 3.3;
        values[3] = 4.4;
        values[4] = 5.5;

        // Accessing and printing elements of the array
        System.out.println("\nElements of the values array:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}

