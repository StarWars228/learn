package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите числитель: ");
            double a = scanner.nextDouble();
            System.out.print("Введите знаменатель: ");
            double b = scanner.nextDouble();

            if (a == 0) {
                System.out.println("На 0 деление запрещено");
                break;
            }

            System.out.println(" Ваш ответ: " + a / b);

        }
    }
}
