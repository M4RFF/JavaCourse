package JavaCourse.OverloadedMethods;

public class overloadmethod {

    public static void main(String[] args) {

        // overloaded methods = methods that share the same but have different parameters
        // method name + parameters = method signature

        int x = add(1, 2, 3, 4);
        System.out.println("The result is " + x);
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method number 1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method number 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method number 3");
        return a + b + c + d;
    }
    static double add(double a, double b) {
        System.out.println("This is overloaded method number 4");
        return a + b;
    }
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method number 5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method number 6");
        return a + b + c + d;
    }
}
