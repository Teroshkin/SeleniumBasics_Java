public class Arithmetic_Oper {

    public static void main (String[] args){

      int a = 2;
      int b = 3;
      int sum = a + b;
        System.out.println(sum);
        sum=sum-5;
        System.out.println(sum);
        sum+=10;
        System.out.println(sum);
        sum ++; // будет равно 11
        System.out.println(sum);
        a=2* sum++; // в данном случае операция будет 2 * 11, а sum++  будет = 12
        System.out.println(a); //  на консоле будет вывведено 22
        b=2* ++sum; // в данном случае операция 2* 12+1
        System.out.println(b); // на консоле будет выведено 26

        /*
        Существует 2 формы инкремента и декремента:

        1. ПОСТФИКСНАЯ  (n++)
        2. ПРЕФИКСНАЯ ( ++n)
        РАЗНИЦА:
            ПОСТФИКСНАЯ - сначала используется старое значение в вычислениях
             - далее в последующих вычислениях используется уже новое значение;

             ПРЕФИКСНАЯ -  сразу используется новое значение в вычислениях;
         */
    }
}
