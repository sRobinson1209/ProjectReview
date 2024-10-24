import java.util.*;
import java.io.*;

public class MenuOptions {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            do {
                System.out.println("Menu Options:");
                System.out.println("Flight Schedule");
                System.out.println("2. Option 2");
                System.out.println("3. Option 3");
                System.out.println("4. Option 4");
                System.out.println("5. Option 5");
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
                        System.out.println("You selected Option 2.");
                        break;
                    case 3:
                        System.out.println("You selected Option 3.");
                        break;
                    case 4:
                        System.out.println("You selected Option 4.");
                        break;
                    case 5:
                        System.out.println("You selected Option 5.");
                        break;
                    case 0:
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while(choice != 0);

            scanner.close();
        }
    }


