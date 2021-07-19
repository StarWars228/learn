package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int vvod = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[vvod];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);

        System.out.print(Arrays.toString(array));
        System.out.println();

        System.out.println("Длинна массива: " + array.length);

        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                counter8++;
        }
        System.out.println("Сумма чисел больше 8: " + counter8);

        int counter0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                counter0++;
        }
        System.out.println("Сумма чисел равных 1: " + counter0);

        int counterEleven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterEleven++;
        }
        System.out.println("Количесто четных чисел: " + counterEleven);

        int counterAdd = 0;
        for (int i = 0; i < array.length; i++){
            if ( array[i] % 2 != 0)
                counterAdd++;
        }
        System.out.println("Количество нечетных чисел: " + counterAdd);

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Сумма всех чисел массива " + sum);
    }
}
