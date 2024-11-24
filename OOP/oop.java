package JavaCourse.OOP;

public class oop {

    public static void main(String[] args) {

        car myCar1 = new car();
        car myCar2 = new car();


        System.out.println("The model of the car is " + myCar1.model);
        System.out.println(myCar1.make);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar1.drive();
        myCar1.brake();

    }

}
