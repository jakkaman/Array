public class ArrayTraversalExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Using for loop:");
        traverseArrayUsingForLoop(numbers);

        System.out.println("\nUsing enhanced for loop:");
        traverseArrayUsingEnhancedForLoop(numbers);

        System.out.println("\nUsing while loop:");
        traverseArrayUsingWhileLoop(numbers);

        System.out.println("\nUsing do-while loop:");
        traverseArrayUsingDoWhileLoop(numbers);
    }

    public static void traverseArrayUsingForLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void traverseArrayUsingEnhancedForLoop(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void traverseArrayUsingWhileLoop(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static void traverseArrayUsingDoWhileLoop(int[] arr) {
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);
    }
}

