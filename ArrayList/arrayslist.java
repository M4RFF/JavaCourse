package JavaCourse.ArrayList;

import java.util.ArrayList;

public class arrayslist {

    public static void main(String[] args) {

        // ArrayList - a resizable array
        // Elements can be added and removed after compilation phase
        // store reference data types
        // ArrayList<Integer>

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Cake");

        food.set(0, "Sushi"); // replacing an element by index
        food.remove(3);
        food.clear(); // no longer we have any elements in arraylist

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
