package Vertex;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) { // Метод main задается общая логика программы, вызываются различные методы
        double num1 = getNumber(); // вызываем  метод getnumber раз с типом дабл. Первое введенное пользователем число мы записываем в переменную num1
        double num2 = getNumber(); // вызываем метод getnumber второй с типом дабл. Второе введенное пользователем число мы записываем в переменную num2
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат:" + result);
    }

    public static double getNumber() {
        Scanner sc = new Scanner(System.in); // создали сканнер и с чего
        System.out.println("Введите число:");
        if(sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");// почему при вводе неправильного числа он просит повторно ввести, вместо того чтобы закрыть выполнение класса
            return getNumber();
        }
    }

    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0; // не понятно почему operationNumber  присвоено значение 0 ???
        if(sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1+num2;
    }

    public static double sub(double num1, double num2) {
        return num1-num2;
    }

    public static double mul(double num1, double num2) {
        return num1*num2;
    }

    public static double div(double num1, double num2) {
        if(num2 != 0.0) {
            return num1/num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }

    public static double calc(double num1, double num2, char operation) { // не понятно зачем еще этот блок  с calc нужен, если вверху вызываем  математические операции
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }
}
