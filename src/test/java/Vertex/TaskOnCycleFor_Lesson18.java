package Vertex;

import java.util.Scanner;

public class TaskOnCycleFor_Lesson18 {
    public static void main (String[]args){
        /*
        TASK 1

        for (int i=1; i<=5; i++){

            System.out.println(i);
        }
         */


        /*
        TASK 2

        for (int i=5; i>=1; i--){

            System.out.println(i);
        }
         */

        /*
        TASK 3

        for(int i =1; i<=10;i++){
            System.out.println("3*"+ i + "="+3*i);
        }

         */
        //TASK 4 - очень интересный
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}
