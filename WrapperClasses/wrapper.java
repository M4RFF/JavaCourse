package JavaCourse.WrapperClasses;

public class wrapper {

    public static void main(String[] args) {

        // wrapper class - provides a way to use primitive data as reference data types
        // reference data type contain useful methods
        // can be used with collections

        //primitive		//wrapper
        //---------		//-------
        // boolean		Boolean
        // char			Character
        // int			Integer
        // double		Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 13;
        Double d = 13.13;
        String e = "Maks";

        if(b == '@') {
            System.out.println("This is true");
        }
    }
}
