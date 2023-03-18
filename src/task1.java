public class task1 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][7];
        int s = 1;
        int numMax = Integer.MIN_VALUE;
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = s++;
                System.out.printf("%4d",matrix[i][j]);
            }
        }


        //ищем наибольший элемент матрицы
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > numMax) {
                    numMax = matrix[i][j];
                }
            }
        }
        System.out.println( "\nНаибольший элемент матрицы - " + numMax);
        //заменяем все нечетные элементы матрицы на наибольший элемент
        System.out.println("Матрица с замененными нечетными элементами на " + numMax + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    matrix[i][j] = numMax;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


