package JavaCourse.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Benz", "C63AMG", 2024);

        car.setYear(2025);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }

}
