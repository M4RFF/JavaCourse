package JavaCourse.StringMethod;

public class string {

    public static void main(String[] args) {

        // String - reference data type that can store one or more characters
        // reference data types have access to useful methods

        String name = "Maks";

        boolean result1 = name.equals("Maks");
        boolean result2 = name.equalsIgnoreCase("maks");
        int result3 = name.length();
        char result4 = name.charAt(0);
        int result5 = name.indexOf("a");
        boolean result6 = name.isEmpty();
        String result7 = name.toUpperCase();
        String result8 = name.toLowerCase();
        String result9 = name.replace("a", "e");

        System.out.println("Result with capital: "+ result1);
        System.out.println("Result ignoring the case of the first letter: "+ result1);
        System.out.println("The length of the : " + result3);
        System.out.println("Result of the first index from name: " +result4);
        System.out.println("Return the position of the letter from name: " + result5);
        System.out.println("Checking if the string is empty: " + result6);
        System.out.println("Converting all letters in name to UpperCase: " + result7);
        System.out.println("Converting all letters in name to LowerCase: " + result8);
        System.out.println("Replacing the letter to another one: " + result9);


    }

}
