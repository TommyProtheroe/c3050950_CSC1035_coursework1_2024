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

        System.out.println("Manufacturer added: " + make);
    }

    public void enterCarModelData() {
        System.out.print("Enter manufacturer name: ");
        String make = scanner.nextLine();

        Manufacturer manufacturer = null;
        for (int i = 0; i < reporting.getManufacturers().size(); i++) {
            if (reporting.getManufacturers().get(i).getMake().equalsIgnoreCase(make)) {
                manufacturer = reporting.getManufacturers().get(i);
                break;
            }
        }

        if (manufacturer == null) {
            System.out.println("Manufacturer not found.");
            return;
        }

        System.out.print("Enter car model name: ");
        String modelName = scanner.nextLine();

        System.out.print("Enter car weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter sales price (£): ");
        double salesPrice = scanner.nextDouble();

        System.out.print("Enter number sold: ");
        int numberSold = scanner.nextInt();
        scanner.nextLine(); // Clear newline character

        System.out.print("Enter car type (hatchback, saloon, estate): ");
        String type = scanner.nextLine();

        CarModel carModel = new CarModel(modelName, weight, salesPrice, numberSold, type);
        manufacturer.getCarModels().add(carModel);

        System.out.println("Car model added: " + modelName + " to manufacturer " + make);
    }

    public void listManufacturers() {
        if (reporting.getManufacturers().isEmpty()) {
            System.out.println("No manufacturers available.");
            return;
        }
    }



}
