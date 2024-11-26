package JavaCourse.SuperKeyword;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman", 34, "Money");
        Hero hero2 = new Hero("IronMan", 32, "$$$");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println();

        System.out.println(hero2.name);
        System.out.println(hero2.age);
        System.out.println(hero2.power);

        System.out.println(hero2.toString());
    }


}
