import java.util.Scanner;

public class DaysOfTheWeek {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number from 1 to 6:");
            if (sc.hasNextInt()) {
                int user_entry = sc.nextInt();
                if (user_entry== 1) {
                    System.out.println("sunday");

                } else if (user_entry == 2) {
                    System.out.println(" Monday");

                } else if (user_entry == 3) {
                    System.out.println("tuesday");
                } else if (user_entry == 4) {
                    System.out.println("Wednesday");

                } else if (user_entry== 4) {
                    System.out.println("Thursday");

                } else if (user_entry == 5) {
                    System.out.println("Friday");


                } else {
                    System.out.println("Invalid Entry");

                }
            }
        }

    }
