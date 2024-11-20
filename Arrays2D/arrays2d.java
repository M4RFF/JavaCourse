package JavaCourse.Arrays2D;

public class arrays2d {

    public static void main(String[] args) {

        // 2D array = an array of arrays
        /*
        String[][] cars = new String[3][3];

        cars[0][0] = "Benz";
        cars[0][1] = "Honda";
        cars[0][2] = "Audi";
        cars[1][0] = "Ford";
        cars[1][1] = "Mazda";
        cars[1][2] = "Tesla";
        cars[2][0] = "Civic";
        cars[2][1] = "BMW";
        cars[2][2] = "Ferrari";
        */

        String[][] cars = {
                            {"Benz", "Honda", "Audi"},
                            {"Ford", "Mazda", "Tesla"},
                            {"Civic", "BMW", "Ferrari"}
        };

        for(int i = 0; i < cars.length; i++) {
            System.out.println();
            for(int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]+ " ");
            }

        }

    }
}
