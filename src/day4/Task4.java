package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));


        int maxSum = 0;
        int maxInd = 0;

        for (int i = 2; i < array.length; i++) {
            int sum = 0;
            int sum3 = array[i] + array[i - 1] + array[i - 2];
            if (sum3 > sum) {
                sum = sum3;
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxInd = i - 2;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxInd);


    }
}
