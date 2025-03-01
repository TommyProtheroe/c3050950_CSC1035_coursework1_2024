import java.util.Scanner;

public class ReportingIO {
    private Reporting reporting = new Reporting();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ReportingIO reportingIO = new ReportingIO();
        reportingIO.runMenu();
    }

    public void runMenu() {
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
            scanner.nextLine();
        }
    }

}




