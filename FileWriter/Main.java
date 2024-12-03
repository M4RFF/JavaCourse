package JavaCourse.FileWriter;

import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Apple is green \nBanana is yellow \n");
            writer.append("\n(My name is Maks)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
