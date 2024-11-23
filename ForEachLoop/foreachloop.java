package JavaCourse.ForEachLoop;

import java.util.ArrayList;

public class foreachloop {

    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in an array/collection
        // less steps, more readable. Less flexible

        String[] animals = {"cat", "dog", "bird", "horse"};
        ArrayList<String> pets = new ArrayList<String>();
        pets.add("cat");
        pets.add("dog");
        pets.add("bird");
        pets.add("horse");

        for(String i : animals) {
            System.out.println(i);
        }

        for(String i : pets) {
            System.out.println(i);
        }

    }

}
