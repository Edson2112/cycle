package ua.edson.cycle;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стартовое значение: ");
        int start = scanner.nextInt();

        System.out.print("Введите конечное значение: ");
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            System.out.print(i);
            if (i < end) {
                System.out.print("+");
            } else {
                System.out.print("\nСумма этих чисел = ");
            }
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
