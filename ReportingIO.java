import java.util.Scanner;

public class ReportingIO {
    private Reporting reporting = new Reporting();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // Method must be inside the class
        ReportingIO reportingIO = new ReportingIO();
        reportingIO.runMenu();
    }

    public void runMenu() { // Method must also be inside the class
        while (true) {
            System.out.println("\nCar Investor Reporting System");
            System.out.println("1. Enter Manufacturer Data");
            System.out.println("2. Enter Car Model Data");
            System.out.println("3. List All Manufacturers");
            System.out.println("4. List Car Models by Manufacturer");
            System.out.println("5. Generate Reports");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline character

            if (choice == 6) {
                System.out.println("Exiting program...");
                break;
            }

            handleMenuChoice(choice);
        }
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                enterManufacturerData();
                break;
            case 2:
                enterCarModelData();
                break;
            case 3:
                listManufacturers();
                break;
            case 4:
                listCarModelsByManufacturer();
                break;
            case 5:
                generateReports();
                break;
            case 6:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    public void enterManufacturerData() {
        System.out.print("Enter manufacturer name: ");
        String make = scanner.nextLine();

        Manufacturer manufacturer = new Manufacturer(make);
        reporting.getManufacturers().add(manufacturer);
    }



}
