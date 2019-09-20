import java.util.Scanner; // импорт сканнера
// https://vertex-academy.com/tutorials/ru/rabota-so-skannerom-v-java/ - Работа со сканнером в JAVA - VERTEX
public class JavaScanner1_Lesson14 {
    public static void main(String args[]) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in); // scan - имя переменной, Scanner - класс, который импортируется 1 строкой в коде см. выше
        int number = scan.nextInt(); //  метод scan.nextInt() считывает число введенное в консоле, которое присвоится переменной int number
        System.out.println("Вы ввели число " + number);
    }

}

