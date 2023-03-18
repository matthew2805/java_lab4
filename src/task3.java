import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int min = arr.length, x = 0;
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(10) + 1;
            }
        }
        int i, j = 0;
        for (i = 0; i < arr.length; i++, System.out.println()) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        for (j = 1; j < arr.length; j++) {
            int count = 0;
            for (i = 1; i < arr.length; i++) {
                if (arr[i][j] % (i + j) == 0)
                    count++;
            }
            if (count <min) {
                min = count;
                x = j;
            }
        }
        String str = String.format("Столбец %d с минимальным количеством элементов %d, кратных сумме индексов. \n", x+1, min);
        System.out.print(str);
    }
}

