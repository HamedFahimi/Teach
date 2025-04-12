public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 4; col++)
                A[row][col] = row * col;
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 4; col++)
                System.out.println("row = " + row + ", column = " + col + ": " + A[row][col]);
    }
}
