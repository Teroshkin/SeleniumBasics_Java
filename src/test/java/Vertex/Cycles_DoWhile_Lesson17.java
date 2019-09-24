package Vertex;

public class Cycles_DoWhile_Lesson17 {
    // ЦИКЛ  do... while  "Делать до тех пор пока" - одна из вариаций цикла while


    public static void main (String []args) {
          /*
          КОД  С ЦИКЛОМ WHILE
           ЦИКЛ WHILE - сначала проверяет условие, затем выполняет код

        int i = 1;
        while (i<0){
            System.out.println(i+ "");
            i++;
        }
        // данный код не будет выполнен, так как в условии i < 0
     */

          // КОД с ЦИКЛОМ do..while - Сначало выполняет тело цикла, а потом проверяет условие - как минимум 1 раз. (ПОСТПРОВЕРКА УСЛОВИЯ)

        int i =1;
        do {
            i++;
            System.out.println(i + "");
        } while (i<0);
    }
}
