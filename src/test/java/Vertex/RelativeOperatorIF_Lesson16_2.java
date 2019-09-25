package Vertex;

import java.util.Scanner;

public class RelativeOperatorIF_Lesson16_2 {
    public static void main (String []args) {
        System.out.println("Введите число 1: ");
        Scanner check = new Scanner(System.in);
        int a = check.nextInt();
        if (a==1){
            System.out.println("Вы ввели число 1");
        }
        else {
            System.out.println("Вы ввели число не равно 1");
        }

    }
}
