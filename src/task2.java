import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][7];
        int s = 1;
        System.out.println();
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = s++;
                System.out.printf("%4d", matrix[i][j]);
            }
        }
        System.out.println("\n");

        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] > max) {
                    max = matrix[i][k];
                }
            }
        }
        System.out.println("Максимальное число: " + max);
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] < min) {
                    min = matrix[i][k];
                }
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("\nНовый массив с удаленными столбцами:\n");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max == matrix[i][j]) {
                    if (!list.contains(j))                              //удаляет столбцы с макс и мин числами
                        list.add(j);
                } else if (min == matrix[i][j]) {
                    if (!list.contains(j))
                        list.add(j);
                }
            }
        }
        int minus = list.size();
        int[][] newmas = new int[4][7 - minus];
        for (int i = 0; i < 4; i++) {
            int f = 0;                                            // новый массив с удал столбц
            for (int j = 0; j < 7; j++) {
                if (!list.contains(j)) {
                    newmas[i][f] = matrix[i][j];
                    f++;
                }
            }
        }
        for (int i = 0; i < newmas.length; i++) {
            for (int j = 0; j <newmas[i].length; j++) {             // вывод массива с удал столбц
                System.out.format("%4d", newmas[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < newmas.length; i++) {
            for (int j = 1; j < newmas[i].length; j++) {        // добавляет столбец с произведение чиссел
                newmas[i][0] *= newmas[i][j];
            }
        }
        System.out.println();
        for (int i = 0; i < newmas.length; i++) {
            for (int j = 0; j < newmas[i].length; j++) {         // итог
                System.out.format("%4d", newmas[i][j]);
            }
            System.out.print("\n");
        }
    }
}
