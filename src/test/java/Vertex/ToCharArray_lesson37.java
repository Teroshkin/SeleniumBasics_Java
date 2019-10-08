package Vertex;

public class ToCharArray_lesson37 {
    public static void main (String []args) {
        // Метод toCharArray() создает из строки массив чаров
        // сhar - один символ, является примитивным типо данных
        // String - ноль и более символов. String класс
        String str = "ABC";
        char [] result = str.toCharArray();
        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element[" + i + "]:"+ result[i]);
    }
}
