package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = 0;
        int min = 100000;
        int count = 0;
        int sum = 0;


        for (int i:array) {
             if (i > max) {
               max = i;
           }
        }
        System.out.println(max);

        for (int i: array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);

        for (int i: array) {
            if (i % 10 == 0) {
                count++;
            }
        }
        System.out.println(count);

        for (int i: array) {
            if (i % 10 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
