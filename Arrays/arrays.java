package JavaCourse.Arrays;

public class arrays {

    public static void main(String[] args) {

        // array is used to store multiple values in a single variable
        String[] cars = {"Benz", "BMW", "Tesla"};
        cars[1] = "Lambo";
        System.out.println("Car: " +cars[1]);

        String[] trucks = new String[3];
        trucks[0] = "Benz";
        trucks[1] = "Tesla";
        trucks[2] = "Opel";
        System.out.println("Truck: " +trucks[0]);

        for(int i = 0; i < cars.length; i++) {
            System.out.println("Car: " + cars[i]);
        }
    }
}
