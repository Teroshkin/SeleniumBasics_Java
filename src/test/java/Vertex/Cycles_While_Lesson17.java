package Vertex;

public class Cycles_While_Lesson17 {
    public static void main (String[]args){
        //Цикл while еще называют цикл "пока" или "до тех пор пока".
       /* int i = 1;
        while (i<8){

            System.out.println(i+ "ai vochhar");
            i++;
        }
        */

       /*
       int i = 1;
       while(i<0) {
           System.out.println(i+"AAAA");
           i++;
       }
       Этот код  не будет выполнен, потому что в условии i < 0, а i = 1
        ======================
        */



       /*
        int i = 1;
        while (true){
            System.out.println(i+"");
            i++;
        }
        Это код будет исполняться бесконечно, потому что в условии указано True.
        А истинным условие будет постоянно, поскольку true - это и есть истина.
        */
       long i = 100000000000l;
       while (i>=10){
           System.out.println(i +"");
           i-=10;
       }
    }
}
