package JavaCourse.OverloadedConstructor;

public class OverloadedConstructor {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust");

        System.out.println("Here are ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
    }

}
