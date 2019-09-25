package Vertex;

public class endsWith_Lesson31 {
    public static void main(String args[]) {
        String line = "Good morning";
        boolean b1 = line.endsWith("morning");
        boolean b2 = line.endsWith("evening");
        System.out.println("String " + line + " ends with 'morning'?  " + b1);
        System.out.println("String " + line + " ends with 'evening'?  " + b2);
    }
}
