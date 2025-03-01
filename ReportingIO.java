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

        System.out.println("\nList of Manufacturers:");
        for (int i = 0; i < reporting.getManufacturers().size(); i++) {
            System.out.println("- " + reporting.getManufacturers().get(i).getMake());
        }
    }

    public void listCarModelsByManufacturer() {
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

        if (manufacturer.getCarModels().isEmpty()) {
            System.out.println("No car models available for " + make + ".");
            return;
        }

        System.out.println("\nCar Models for " + make + ":");
        for (int i = 0; i < manufacturer.getCarModels().size(); i++) {
            CarModel car = manufacturer.getCarModels().get(i);
            System.out.println("- " + car.getName() + " (£" + car.getSalesPrice() + ", " + car.getType() + ")");
        }
    }

    public void generateReports() {
        System.out.println("\nReport Options:");
        System.out.println("1. Most expensive car sold");
        System.out.println("2. Manufacturer with highest revenue for a given car type");
        System.out.println("3. All car models above a certain price");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                CarModel expensiveCar = reporting.getMostExpensiveCarSold();
                if (expensiveCar == null) {
                    System.out.println("No car models available.");
                } else {
                    System.out.println("Most expensive car sold: " + expensiveCar.getName() + " (£" + expensiveCar.getSalesPrice() + ")");
                }
                break;

            case 2:
                System.out.print("Enter car type (hatchback, saloon, estate): ");
                String type = scanner.nextLine();
                Manufacturer topManufacturer = reporting.getManufacturerWithHighestRevenue(type);
                if (topManufacturer == null) {
                    System.out.println("No manufacturers found for that car type.");
                } else {
                    System.out.println("Manufacturer with highest revenue for " + type + ": " + topManufacturer.getMake());
                }
                break;

            case 3:
                System.out.print("Enter minimum price: ");
                double minPrice = scanner.nextDouble();
                scanner.nextLine();
                List<CarModel> expensiveCars = reporting.getAllCarModelsAbovePrice(minPrice);
                if (expensiveCars.isEmpty()) {
                    System.out.println("No car models found above £" + minPrice);
                } else {
                    System.out.println("Car models above £" + minPrice + ":");
                    for (int i = 0; i < expensiveCars.size(); i++) {
                        System.out.println("- " + expensiveCars.get(i).getName() + " (£" + expensiveCars.get(i).getSalesPrice() + ")");
                    }
                }
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }



}
