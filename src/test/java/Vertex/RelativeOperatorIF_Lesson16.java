package Vertex;

import java.util.Scanner;
//relative -  условный
public class RelativeOperatorIF_Lesson16 {
    public static void main (String[]args){
        // If часто используемый  условный оператор
        //switch редко используется
        // == - оператора равенства - используется когда проверяется значение переменной на равенство
        // начинается условие всегда с if, если условий несколько то каждое следующее записывается else if, и в конце else без условия
        // когда проверяе
        System.out.println("Введите число 1,2 или 3: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt(); // Сканируем то что введет пользователь
        if (i==1) { //(i==1 условие)
            System.out.println("Я тебя люблю");
        }
        else if (i==2){
            System.out.println("КОська хочешь чмаффну?");
        }
        else if (i==3){
            System.out.println("Ես ՉԵՄ ԳԱԼԻՍ");
        }
        else {
            System.out.println("Жулик не воруй");
        }
        b();
    }
    static void b (){
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
