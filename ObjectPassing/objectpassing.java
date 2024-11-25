package JavaCourse.ObjectPassing;

public class objectpassing {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car1 = new Car("Benz");
        Car car2 = new Car("BMW");

        garage.park(car1);
        garage.park(car2);
    }

}
