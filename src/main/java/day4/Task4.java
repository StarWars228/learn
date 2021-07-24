package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int [] array = new int [10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++){
            int sum = 0;
            for(int k = i; k < i + 3; k++){
                sum = array[k] + sum;
            }
            if (sum > maxSum){
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSum + " Максимальная сумма 3х элементов");
        System.out.println(maxSumIdx + " Индекс максимальной суммы");
    }
}
