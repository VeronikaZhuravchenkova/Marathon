package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        double a;
        double b;

        while (counter <= 4) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            counter++;
            if (b == 0) {
                System.out.println("деление на 0");
                continue;
            }
            double c = a / b;
            System.out.println(c);

        }



    }
}
