package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >=1 && a <= 4) {
            System.out.println("малоэтажный дом");
        } else if ( a >= 5 && a <= 8) {
            System.out.println("среднеэтажный дом");
        } else if (a >= 9) {
            System.out.println("многоэтажный дом");
        } else {
            System.out.println("ошибка ввода");
        }
    }
}
