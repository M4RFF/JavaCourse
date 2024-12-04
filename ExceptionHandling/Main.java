package JavaCourse.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter the whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter the whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("The result is " + z);
        }
        catch(ArithmeticException ae) {
            System.out.println("You can't divide by zero! Dummy");
        }
        catch(InputMismatchException i) {
            System.out.println("Please enter a number, Dude");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }
    }
}
