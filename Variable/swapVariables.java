package JavaCourse.Variable;

public class swapVariables {
    public static void main(String[] args) {

        String x = "water";
        String y = "Coca-Cola";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " +x);
        System.out.println("y: " +y);
    }

}