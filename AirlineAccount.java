
    import java.util.Scanner;

    public class AirlineAccount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Welcome Message//
            System.out.println("-------------------------------------------");
            System.out.println("Welcome to the Belmont Palindrome Airlines");
            System.out.println("-------------------------------------------");

            // Prompt the user to create an account
            System.out.println("***********");
            System.out.println("USER LOGIN");
            System.out.println("***********");

            System.out.print("Enter an airline account\nUsername: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            System.out.println("Enter the 4 digit pin code");
            String pin = scanner.nextLine();
            System.out.println("Verify your birthdate");
            String birthday = scanner.nextLine();

            System.out.println("------------");
            System.out.println("Menu Options");
            System.out.println("------------");

            //Scanner scanner = new Scanner(System.in);
            int choice = 0;

            do {
                System.out.println("Menu Options:");
                System.out.println("1. Flight Schedule");
                System.out.println("2. Book a Flight");
                System.out.println("3. View your plane ticket");
                System.out.println("4. Change password");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("Nashville to Las Angeles   Southwest  9:00am\n" +
                                "\n" +
                                "Nashville to Baltimore     Delta      11:00am\n" +
                                "\n" +
                                "Albany    to Houston       American   12:15pm\n" +
                                "\n" +
                                "Orlando   to Lansing       Spirit     2:45pm\n" +
                                "\n" +
                                "Long Beach to Nashville    Delta      1:15pm");
                        break;
                    case 2:
                        System.out.println("Book a Flight from the flight menu (Option 1) ");
                        break;
                    case 3:
                        System.out.println("Ticket number not found");
                        break;
                    case 4:
                        System.out.println("Change your password");
                        break;
                    case 0:
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while(choice != 0);

            scanner.close();


            // Check if the password is a palindrome
            boolean isPalindrome = true;
            for (int i = 0; i < password.length() / 2; i++) {
                if (password.charAt(i) != password.charAt(password.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print the result
            if (isPalindrome) {
                System.out.println("Your password is a palindrome");
            } else {
                System.out.println("Your password is not a palindrome.");
            }
        }
    }


