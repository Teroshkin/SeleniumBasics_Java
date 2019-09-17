public class Concatenation {
    //конкатенация = обьединение строк
    public static void main (String[]args){
        String morning1 = "доброе";
        String morning2 = "не доброе, потому что сегодня понедельник";
        System.out.println("Сегодня утро " + morning1); // конкатенация с помощью оператора +  (есть и другие способы обьединения/конкатенации строк)
        System.out.println("Сегодня утро " + morning2); // конкатенация с помощью оператора +

        String name = "Виктор";
        String car = "Porsche 918 Spyder";
        System.out.println(name + " купил " + car);
    }
}
