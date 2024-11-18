package JavaCourse.IfStatement;

public class ifstatement {
    public static void main(String[] args) {

        int age = 20;

        if(age >= 75) {
            System.out.println("Okay, Boomer!");
        }
        else if(age >= 18) {
            System.out.println("You are an adult!");
        }
        else if(age >= 14) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are not an adult");
        }
    }
}
