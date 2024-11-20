package JavaCourse.LogicalOperators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class logic {

    public static void main(String[] args) {

        int temp = 25;
        // ( && - And )
        if(temp>30) {
            System.out.println("It's hot outside!");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("It's worm outside!");
        }
        else {
            System.out.println("It's cold outside!");
        }


        // ( || - OR ) ( ! - NOT )
        Scanner sc = new Scanner(System.in);

        System.out.println("If you wanna quit the game, plz press 'q' or 'Q'");
        String response = sc.next(); // store the next key which user is clicked

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game");
        }
        else {
            System.out.println("You quit the game!");
        }
    }
}
