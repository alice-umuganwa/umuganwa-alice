import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Docker Project ID: 26643");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Java Project Launcher ===");
            System.out.println("1. Internship Management System");
            System.out.println("2. Vehicle Tax Management System");
            System.out.println("3. Tax Enforcement System");
            System.out.println("4. Exit");
            System.out.print("Choose a program to run (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Running Internship Management System ---");
                    InternshipManagementSystem.main(args);
                    break;
                case 2:
                    System.out.println("\n--- Running Vehicle Tax Management System ---");
                    VehicleTaxManagementSystem.main(args);
                    break;
                case 3:
                    System.out.println("\n--- Running Tax Enforcement System ---");
                    TaxEnforcementSystem.main(args);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}

