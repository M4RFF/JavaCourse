package JavaCourse.ArrayList2D;

import java.util.ArrayList;

public class arraylist2d {

    public static void main(String[] args) {

        // 2DArrayList - a dynamic list of lists
        // We can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("cucumbers");
        produceList.add("bananas");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("tea");
        drinkList.add("soda");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(bakeryList);
        System.out.println("The first element of the arraylist is " +bakeryList.get(0));

        System.out.println(groceryList);
    }

}
