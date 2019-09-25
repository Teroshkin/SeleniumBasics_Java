package Vertex;

public class Generation_of_Random_Numbers_Lesson23 {
    //https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/
    public static void main (String []args){
        //Math.random() - генерирует случайные вещественные числа из промежутка [0;1), т.е. от нуля включительно до 1 исключительнно
        // т.е. любое число меньше 1
        double a = Math.random();



        System.out.println (a);
    b();
    }
    static void b (){
        double a = Math.random()+3;
        System.out.println(a);
        c();
    }

    static void  c(){
        int a = (int) ( Math.random() * 100 );
        System.out.println(a);
        }
    }
