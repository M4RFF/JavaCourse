package JavaCourse.MathClass.triangel;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
    // create a program that will find a hypotenuse of a triangle
    // ask a user to sing x, y to find z

        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = sc.nextDouble();
        System.out.println("Enter side y: ");
        y = sc.nextDouble();

        z = Math.sqrt(x*x + y*y);
        System.out.println("The hypotenuse of the triangle is " +z);

        sc.close();
    }
}
