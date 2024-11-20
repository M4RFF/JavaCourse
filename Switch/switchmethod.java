package JavaCourse.Switch;

public class switchmethod {

    public static void main(String[] args) {

        String day = "Friday";

        switch(day) {
            case "Sunday":
                System.out.println("It's Sunday");
                break;
                case "Monday":
                    System.out.println("It's Monday");
                    break;
                    case "Tuesday":
                        System.out.println("It's Tuesday");
                        break;
                        case "Wednesday":
                            System.out.println("It's Wednesday");
                            break;
                            case "Friday":
                                System.out.println("It's Friday");
                                break;
                                default:
                                    System.out.println("It's Saturday!");

        }

    }
}
