public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing a 2D integer array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing and printing elements of the 2D array
        System.out.println("Elements of the matrix array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Declaring and initializing a 3D string array
        String[][][] cube = {
            {
                {"Red", "Green"},
                {"Blue", "Yellow"}
            },
            {
                {"Black", "White"},
                {"Purple", "Orange"}
            }
        };

        // Accessing and printing elements of the 3D array
        System.out.println("\nElements of the cube array:");
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

