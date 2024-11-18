package JavaCourse.GUI;

import javax.swing.JOptionPane;

public class GUIapp {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hey " +name+ "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are " +age+ "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height?"));
        JOptionPane.showMessageDialog(null, "You are " +height+ "cm");

    }
}
