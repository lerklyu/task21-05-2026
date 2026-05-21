public class ShowForUser {
    public static void showMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("____________________________________________");
    }
}
