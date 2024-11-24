package JavaCourse.OOP.Constructor;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Rick", 34, 75);
        Human human2 = new Human("Scott", 32, 80);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }

}
