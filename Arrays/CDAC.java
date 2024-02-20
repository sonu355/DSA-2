import java.util.Scanner;

public class CDAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] customMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                customMatrix[i][j] = scanner.nextInt();
            }
        }

        int[] result = findCustomSignificantPoint(customMatrix, size);

        if (result[0] != -1) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            System.out.println("-1");
        }

        scanner.close();
    }

    static int[] findCustomSignificantPoint(int[][] customMatrix, int size) {
        int[] result = new int[3];
        result[0] = -1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isSmallestInCustomRow(customMatrix, i, j, size) && isLargestInCustomColumn(customMatrix, i, j, size)) {
                    result[0] = customMatrix[i][j];
                    result[1] = i;
                    result[2] = j;
                    return result;
                }
            }
        }

        return result;
    }

    static boolean isSmallestInCustomRow(int[][] customMatrix, int row, int col, int size) {
        int value = customMatrix[row][col];
        for (int j = 0; j < size; j++) {
            if (customMatrix[row][j] < value) {
                return false;
            }
        }
        return true;
    }

    static boolean isLargestInCustomColumn(int[][] customMatrix, int row, int col, int size) {
        int value = customMatrix[row][col];
        for (int i = 0; i < size; i++) {
            if (customMatrix[i][col] > value) {
                return false;
            }
        }
        return true;
    }
}
