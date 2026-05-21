public class RotatingMatrix {

    public static int[][] rotate90(int[][] originalMatrix, int[][] newMatrix) {
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix.length; j++) {
                newMatrix[i][j] = originalMatrix[originalMatrix.length - 1 - j][i];
            }
        }
        return newMatrix;
    }

    public static int[][] rotate180(int[][] originalMatrix, int[][] newMatrix) {
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix.length; j++) {
                newMatrix[i][j] = originalMatrix[originalMatrix.length - 1 - i][originalMatrix.length - 1 - j];
            }
        }
        return newMatrix;
    }

    public static int[][] rotate270(int[][] originalMatrix, int[][] newMatrix) {
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix.length; j++) {
                newMatrix[i][j] = originalMatrix[j][originalMatrix.length - 1 - i];
            }
        }
        return newMatrix;
    }
}
