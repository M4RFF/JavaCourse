package JavaCourse.AccessModifiers.package1;

import JavaCourse.AccessModifiers.package2.*;

public class A {

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.publicMsg);

        B b = new B();
    }

}
