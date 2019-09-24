package Vertex;

import java.util.Scanner;

public class OperatorBreak_Lesson20 {
    public static void main(String[] args) {
        /*int a =1;
        int i = 3;
        while( a<=5) {
            System.out.println(a+ " Цикл выполняется");
            if (a==i) break;
            a++;

         */
        /*for (int i = 1; i <= 3; i++) {
            System.out.println("Это первый цикл! Я выполняюсь " + i + " раз");
            for (int a = 1; a <= 10; a++) {
                System.out.println("    Это второй цикл! Я выполняюсь " + a + " раз");
                if (a == 2)
                    break;
            }

         */
        System.out.println("Введите 1, 2, 3 или 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            case 4:
                System.out.println("Вы ввели число 4");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
    }
}
