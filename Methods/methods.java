package JavaCourse.Methods;

public class methods {

    public static void main(String[] args) {
        // method - a block of code that is executed whenever it's called upon
        String name = "Maks";
        int age = 20;

        hello(name, age);

        int x = 13;
        int y = 31;
        int z = add(x, y);

        System.out.println("The sum of two numbers is " + z);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name + "!");
        System.out.println("Are you " + age + " years old?");
    }

    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

}
