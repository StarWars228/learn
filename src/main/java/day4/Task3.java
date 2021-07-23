package day4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int sizeLine = scanner.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int sizeUp = scanner.nextInt();

        Random random = new Random();

        int[][] matrice = new int[sizeLine][sizeUp];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(50);

                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < matrice.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                sum = sum + matrice[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumInd = i;
            }
        }
        System.out.println();
        System.out.println(" Индекс строки с максимальной суммой - " + maxSumInd);
    }
}