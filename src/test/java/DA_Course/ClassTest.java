package DA_Course;
import org.testng.annotations.*;
/**
 *  ClassTest
 */


public class ClassTest {
    int number = 1; // обьект
    @Test

    public void test(){
        System.out.println(number);//команада
        System.out.println(getNumber());//команда. - cначала вызовется getNumber, он выведет нам один, а потом выведется System.out, которые покажется "1" в консоле

    }

    public int getNumber(){
        return 3; // что сделает этот метод? он его вызовет и вернет нам единичку
    }

    @Test
    public void test2(){
        printNumber(number);
        String someText = "automation"; // обьект
    }
    //нельзя обьявлять  одну и ту же переменную в разных методах - !
    //чтобы получить доступ к одной переменной из всех методов, то ее нужно вынести в класс, тогда в самом методе уже не надо обьявлять тип
    // В тестовые методы обычно ничего не передаем
    // Если метод обычный
    public void printNumber(int number){
        this.number=4 ;
        System.out.println(number);
    }
}

