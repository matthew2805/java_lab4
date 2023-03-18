import java.util.*;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class task4 {
    static int[] GetAra(String num ) {
        String[] znachara = num.split(" ");
        int[] intznach = new int[znachara.length];
        for (int u = 0; u < znachara.length; u++) {
            intznach[u] = parseInt(znachara[u]);
        }
        return intznach;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("на сколько матрица");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(1, 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int mx = 0;
        String znach;
        int count;
        String znachub;
        int countub;
        for (int i = 0; i < matrix[0].length; i++) {
            znach = Integer.toString(matrix[0][i]);
            count = 0;
            znachub = Integer.toString(matrix[0][i]);
            countub = 0;
            for (int j = 0; j < matrix.length - 1; j++) {

                if (matrix[j][i] < matrix[j + 1][i]) {
                    count++;
                    znach += " " +Integer.toString(matrix[j + 1][i]);
                }
                if (matrix[j][i] > matrix[j + 1][i]) {
                    countub++;
                    znachub += " " + Integer.toString(matrix[j + 1][i]);
                }
            }
            if (count == matrix.length - 1) {
                int [] intznach =GetAra(znach);
                IntStream intStream = Arrays.stream(intznach);
                OptionalInt optionalInt = intStream.max();
                if (mx < optionalInt.getAsInt()) {
                    mx = optionalInt.getAsInt();
                }
            }
            if (countub == matrix.length - 1) {
                int [] intznach =GetAra(znachub);
                IntStream intStream = Arrays.stream(intznach);
                OptionalInt optionalInt = intStream.max();
                if (mx < optionalInt.getAsInt()) {
                    mx = optionalInt.getAsInt();
                }
            }
        }
        System.out.println("max " + mx);
    }
}
