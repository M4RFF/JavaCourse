package JavaCourse.UserInput;


import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Where are you from? ");
        String country = scanner.nextLine();
        System.out.println("How long have you been leaving there? ");
        int years = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your favorite food?");
        String food = scanner.nextLine();



        System.out.println("I've never been to "+country);
        System.out.println("Wow, You were leaving there for " +years+ " years");
        System.out.println("You're a big fan of " +food);
    }
}
