package estruturacondicional;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int daysWeek = input.nextInt();

        switch (daysWeek) {
            case 1:
                System.out.println("Days week: Sunday");
                break;
            case 2:
                System.out.println("Days week: Monday");
                break;
            case 3:
                System.out.println("Days week: Tuesday");
                break;
            case 4:
                System.out.println("Days week: Wednesday");
                break;
            case 5:
                System.out.println("Days week: Thursday");
                break;
            case 6:
                System.out.println("Days week: Friday");
                break;
            default:
                System.out.println("Days week: value invalid");
                break;
        }

    }
}
