public class MultidimensionalArrayExample {

    public static void updateMatrix(int[][] matrix, int row, int col, int newValue) {
    if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length) {
        matrix[row][col] = newValue;
    } else {
        System.out.println("Invalid row or column index.");
    }
}

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Elements of the matrix array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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

    updateMatrix(matrix, 1, 1, 10); // แทนที่ค่าที่ตำแหน่ง [1][1] ด้วยค่า 10

}


