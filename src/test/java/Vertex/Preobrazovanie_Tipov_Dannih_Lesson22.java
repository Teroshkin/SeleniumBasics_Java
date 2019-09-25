package Vertex;

public class Preobrazovanie_Tipov_Dannih_Lesson22 {
        // ПРИМЕР АВТОМАТИЧЕСКОГО ПРЕОБРАЗОВАНИЯ переменных ;(неявное)
        public static void main(String[] args) {

            byte a = 15;

            int b = a; // переход переменной A в более большой контейнер int

            System.out.println(b);
            c();

        }
        // ПРИВЕДЕНИЕ ТИПОВ (явное)
        static void c(){
            int a=0;

            long b=15;

            a = (int) b;
            System.out.println(a);
            d();
        }
        static void d(){
            //дробная часть не округляется, а отбрасывается.
            double a=11.2345;

            int b=(int)a;

            System.out.println(b); // в консоли получится число 11
        e();
        }
        static void e(){
            double a =128;
            byte b = (byte)a;
            System.out.println(b);//в консоли увидим -128
        }

}
