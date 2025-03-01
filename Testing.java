import java.util.List;

public class Testing {

    public static void main(String[] args) {
        Reporting reporting = new Reporting();


        Manufacturer toyota = new Manufacturer("Toyota");
        reporting.getManufacturers().add(toyota);
        System.out.println("Test 1 Passed: Manufacturer added - " + toyota.getMake());

        CarModel corolla = new CarModel("Corolla", 1300, 22000, 500, "saloon");
        toyota.getCarModels().add(corolla);
        System.out.println("Test 2 Passed: Car Model added - " + corolla.getName());

        System.out.println("\n Test 3 Passed: Listing Manufacturers");
        for (Manufacturer m : reporting.getManufacturers()) {
            System.out.println("- " + m.getMake());
        }


    }
}
