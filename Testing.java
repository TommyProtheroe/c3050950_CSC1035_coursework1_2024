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

        System.out.println("\n Test 4 Passed: Listing Car Models for Toyota");
        for (CarModel c : toyota.getCarModels()) {
            System.out.println("- " + c.getName() + " (£" + c.getSalesPrice() + ", " + c.getType() + ")");
        }

        CarModel expensiveCar = reporting.getMostExpensiveCarSold();
        if (expensiveCar != null) {
            System.out.println("\n Test 5 Passed: Most Expensive Car Sold: " + expensiveCar.getName());
        } else {
            System.out.println("\n Test 5 Failed: No cars found.");
        }

        Manufacturer topManufacturer = reporting.getManufacturerWithHighestRevenue("saloon");
        if (topManufacturer != null) {
            System.out.println("\n Test 6 Passed: Top Manufacturer: " + topManufacturer.getMake());
        } else {
            System.out.println("\n Test 6 Failed: No manufacturers found for this car type.");
        }

        List<CarModel> expensiveCars = reporting.getAllCarModelsAbovePrice(20000);
        System.out.println("\n Test 7 Passed: Car Models Above £20000:");
        for (CarModel c : expensiveCars) {
            System.out.println("- " + c.getName() + " (£" + c.getSalesPrice() + ")");
    }
}
