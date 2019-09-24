package Vertex;

import java.util.Scanner;
/*
Конструкции с операторами if else, предлагающими
большое количество условных ветвлений, могут выглядеть очень громоздкими. Поэтому в тех случаях, когда необходимо
повторять проверку одного и того же значения переменной, есть более элегантное решение с помощью оператора switch.


 */
public class RelativeOperatorSwitch_Lesson16 {
    public static void main (String []args){
        System.out.println("Введите 1,2,3, или 4");
        Scanner pukotscan = new Scanner (System.in);
        int number = pukotscan.nextInt();
        switch (number){
            case 1: System.out.println("Вы ввели число 1"); break;
            case 2: System.out.println("Вы ввели число 2"); break;
            case 3: System.out.println("Вы ввели число 3"); break;
            case 4: System.out.println("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели неправильное число "); break;


        }
    }
}
