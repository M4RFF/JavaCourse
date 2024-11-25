package JavaCourse.OverloadedConstructor;

public class Pizza {

    String bread;
    String topping;
    String cheese;
    String sauce;

    Pizza(String bread, String topping, String cheese, String sauce) {
        this.bread = bread;
        this.topping = topping;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    Pizza(String bread, String topping, String cheese) {
        this.bread = bread;
        this.topping = topping;
        this.cheese = cheese;
    }

    Pizza(String bread, String topping) {
        this.bread = bread;
        this.topping = topping;
    }

    Pizza(String bread) {
        this.bread = bread;
    }

}
