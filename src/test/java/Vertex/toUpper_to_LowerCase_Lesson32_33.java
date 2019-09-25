package Vertex;

public class toUpper_to_LowerCase_Lesson32_33 {
    //To upper
    public static void main (String[]args){
        String str = "fuck you fucktards";
        String result = str.toUpperCase();
        System.out.println("все прописнымы: " + result);

        str = "new value";
        result = str.toUpperCase();
        System.out.println("new rest: " + str); // Почему выводит маленькими ХЗ

     // To lower
        String lowerCase = "FUCK YOU FUCKTARDS";
        String result2 = lowerCase.toLowerCase();
        System.out.println("lowerCase "+ result2);
    }
}
