package day4;
import java.util.Arrays;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        System.out.println(Arrays.toString(array)); // вывожу массив в консоль

        int max = 0;
        for (int element : array) {
            if (element > max)
                max = element;
        }
        System.out.println(max + " - максимальное значение");

        int min = 10000;
        for (int element1 : array) {
            if (element1 < min)
                min = element1;
        }
        System.out.println(min + " - минимальное значение");

        int counter = 0;
        for (int element: array){
            if(element % 10 == 0)
                counter++;
        }
        System.out.println(counter + " - кол-во чесел на конце 0");

        int sum = 0;
        for(int sumMax : array){
            if (sumMax % 10 == 0)
                sum = sumMax + sum;
        }
        System.out.println(sum + " - сумма элементов оканчивающихся на 0");
    }
}