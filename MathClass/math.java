package JavaCourse.MathClass;

public class math {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;
        double z = 36;

        double max = Math.max(x, y); // x
        double min = Math.min(x, y); // y
        double abs = Math.abs(y); // 10
        double sqrt = Math.sqrt(z); // 6
        double round = Math.round(x); // 3.0
        double ceil = Math.ceil(x); // 4.0
        double floor = Math.floor(x); // 3.0

        System.out.println(max);
        System.out.println(min);
        System.out.println(abs);
        System.out.println(sqrt);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);
    }
}
