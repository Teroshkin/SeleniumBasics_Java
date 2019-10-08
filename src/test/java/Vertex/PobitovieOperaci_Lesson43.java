package Vertex;

public class PobitovieOperaci_Lesson43 {
    public static void main(String[] args) {
        System.out.println("Пример работы с типом byte");
        byte a = 48;
        byte b = (byte) ~a;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа:" + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
    }


    }
