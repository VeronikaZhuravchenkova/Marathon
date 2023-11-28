package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum = 0;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8){
                count1++;
            }
        }
        System.out.println("Количество цифр больше 8: " + count1);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count2++;
            }
        }
        System.out.println("Количество чисел равных 1: " + count2);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count3++;
            }
        }
        System.out.println("Количество четных чисел: " + count3);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count4++;
            }
        }
        System.out.println("Количество нечетных чисел: " + count4);

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
