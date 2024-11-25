package JavaCourse.VariableScope;

import java.util.Random;

public class DiseRoller {

    Random random;
    int number;

    DiseRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
