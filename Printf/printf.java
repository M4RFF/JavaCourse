package JavaCourse.Printf;

public class printf {

    public static void main(String[] args) {

        // printf = an optional method to control, format and display text to the console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        System.out.printf("%d This is format string", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Maksim";
        int myInt = 1331;
        double myDouble = 13;

        // [converting-character]
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("What's poppin? %-10s", myString);

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("\nThis is a lucky number %.2f", myDouble);

    }

}
