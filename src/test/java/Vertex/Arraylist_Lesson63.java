package Vertex;

import java.util.ArrayList;

public class Arraylist_Lesson63 {
    public static void main(String[] args) {


        // Обычный массив  из 4 элементов
       /* String [] deliveryCities = {"Chicago", "New Yourk", "Toronto", "Paris"};
        // Создаем второй массив чтобы добавить в него 4 элемента из предыдущего массива. Поскольку массивы в Java не изменяются
        String [] deliveryCitites2 = new String [deliveryCities.length + 1];{
            for (int i = 0; i < deliveryCities.length; i++ );

        */
      /* ArrayList<String>deliveryCities = new ArrayList<>();
        deliveryCities.add("Chicago");
        deliveryCities.add("New York");
        deliveryCities.add("Toronto");
        deliveryCities.add("Paris");
        System.out.println(deliveryCities.size());
        deliveryCities.add(2, "Paris"); // добавили в массив еще один город, в середину между ньйорк и торонто
        System.out.println(deliveryCities.size());

       */


            // Решение с помощью цикла for
            ArrayList<Integer> list = new ArrayList();
            list.add(51);
            list.add(136);
            list.add(387);

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        b();


        }
        // Решение с помощью цикла for each
    static void b (){
        ArrayList <Integer> list = new ArrayList();
        list.add(51);
        list.add(136);
        list.add(387);

        for (Integer i:list) {
            System.out.println(i);
        }
    }
}


