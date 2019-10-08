package Vertex;

import java.util.ArrayList;

public class CycleForEach_Lesson36 {
// Задача 1  с помощью цикла for
    public static void main (String []args){
        int array1 [] = {44,55,66,77,88};
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
            System.out.println();
        }
        b();
    }
    // Задача 1  с помощью цикла for each - ЛАКОНИЧНо
    static void b(){
        int array [] = {44,55,66,77,88};
        for(int i:array){
            System.out.println(i);
        }
        d();
        c();
    }
    // Задача 2  с помощью цикла for
    static void d(){
    ArrayList<Integer> list = new ArrayList<>();
            list.add(51);
            list.add(136);
            list.add(387);

            for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }
    }

    //Задача 2 цикл for each
    static void c(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(136);
        list.add(387);

        for (Integer i:list) {
            System.out.println(i);
        }
    }
}

