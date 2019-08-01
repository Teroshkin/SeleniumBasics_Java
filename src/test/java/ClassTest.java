import org.testng.annotations.Test;

public class ClassTest {
    // Чтобы  сделать переменную доступную для всех методов нужно вынести ее в сам класс
    int number = 1;
    @Test
    public void test (){ // обьявленное в одном методе не может быть обьявленно в рамках второго метода
        // int number =1;
        String sometext ="automation";
        System.out.println(number);
        System.out.println(getNumber());
    }
    public void test2 (){ // обьявленное в одном методе не может быть обьявленно в рамках второго метода
        // int number =1;
        System.out.println(number);
    }
    public int getNumber(){
        return 1; // вернет едиинчку
    }
}
