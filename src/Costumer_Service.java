import java.util.Scanner;

public class Costumer_Service {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Welcome to COSTUMER CARE SERVICE ");
        System.out.print("\n press 1 for ENGLISH, \n press 2 for HINDI \n press 3 for talk to the customer care \n press 4 to send the voice mail: ");
         if(sc.hasNextInt())
         {
             int choice =sc.nextInt();
             switch (choice)
             {
                 case 1:
                     System.out.println("ENGLISH");
                     break;
                 case 2:
                     System.out.println("HINDI");
                     break;
                 case 3: System.out.println("talk to the customer care");
                     break;
                 case 4: System.out.println("send the voice mail:");
                     break;
                 default:
                     System.out.println("Please enter a valid input");
             }
         }

         }

    }

