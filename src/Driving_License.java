import java.util.Scanner;

public class Driving_License {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE AS PER CERTIFICATE");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x >= 0 && x< 18) {
                System.out.println("you are NOT ELIGIBLE for driving license");

            } else if (x >= 18 && x< 20)
                System.out.println(" you are ELIGIBLE for driving license");

        }
       else
    {
            System.out.println("PLEASE ENTER VALID AGE");
        }

    }


}
