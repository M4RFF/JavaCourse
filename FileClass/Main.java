package JavaCourse.FileClass;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("JavaLearning.txt");

        if(file.exists()) {
            System.out.println("File exists!");
            System.out.println(file.getPath());
        }
        else {
            System.out.println("File does not exist!");
        }

    }

}
