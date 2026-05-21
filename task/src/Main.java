import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {
        boolean exit = true;
        System.out.println("Основная матрица: ");
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        ShowForUser.showMatrix(colors);

        Scanner scanner = new Scanner(System.in);

        while (exit) {
            System.out.println("Введите градус поворота матрицы: 90, 180, 270 или end");
            String input = scanner.nextLine();
            switch (input) {
                case "end": {
                    exit = false;
                    break;
                }
                case "90": {
                    int[][] rotatedColors90 = new int[SIZE][SIZE];
                    ShowForUser.showMatrix(
                            RotatingMatrix.rotate90(colors, rotatedColors90));
                    break;
                }
                case "180": {
                    int[][] rotatedColors180 = new int[SIZE][SIZE];
                    ShowForUser.showMatrix(
                            RotatingMatrix.rotate180(colors, rotatedColors180));
                    break;
                }
                case "270": {
                    int[][] rotatedColors270 = new int[SIZE][SIZE];
                    ShowForUser.showMatrix(
                            RotatingMatrix.rotate270(colors, rotatedColors270));
                    break;
                }
            }
        }
    }
}
