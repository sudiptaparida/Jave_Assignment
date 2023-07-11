public class Costumer_Care {
    public static void main(String[] args)


    {

        System.out.print("Welcome to COSTUMER CARE SERVICE ");
        System.out.print("\n press 1 for ENGLISH, \n press 2 for HINDI \n press 3 for talk to the customer care \n press 4 to send the voice mail: ");

        {
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println(" ENGLISH");
                    break;
                case 2:
                    System.out.println("HINDI");
                    break;
                case 3: System.out.println(" TALK TO THE COSTUMER SERVICE ");
                    break;
                case 4: System.out.println("SEND THE VOICE MAIL");
                    break;
                default:
                    System.out.println("Please enter a valid input");
            }
        }
        else
        {
            System.out.println("please enter a valid number");
        }


    }
}
}
