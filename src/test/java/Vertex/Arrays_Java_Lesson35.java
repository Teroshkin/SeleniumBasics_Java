package Vertex;

public class Arrays_Java_Lesson35 {
        public static void main (String[]args){
            int [] array1 = {5,6,7,8,9};
            String [] array2 = {"Java", "is the best"};
            System.out.println(array1[0]);
            System.out.println(array2[1]);

            int k = array1.length; // посчитает длину массива
            // В любом массиве значения элементов сохраняются под порядковыми номерами (индексами) {5,6,233} - 0, 1, 2
            System.out.println(k);
            b();
        }
        static void b(){
            // ПУСТОЙ МАССИВ
            int []array1 = new int[3];
            // наполняем массив значениями
            array1 [0]=5;
            array1[1]=2;
            c();
        }
        static void c(){

            int[] array1 = new int[3];

            array1[0]=5;
            array1[1]=17;
            array1[2]=350;

            for( int i = 0; i < array1.length; i++){
                System.out.println(array1[i]);

            }

            }
        }

