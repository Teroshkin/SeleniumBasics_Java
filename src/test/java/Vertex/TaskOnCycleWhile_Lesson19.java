package Vertex;

public class TaskOnCycleWhile_Lesson19 {
    public static void main (String []args){
        /*int a = 7;
        while (a<=98) {
            System.out.println(a+"");
            a+=7;
        }

         */
        int a = 1;
        while (a<=512){

            System.out.println(a+ "");
            a*=2; // Операция умножения ставим после sout потому что int a = 1, консоль покажет в первую очередь, а уже затем он начнет умножать и зацикливать
        }
    }
}
