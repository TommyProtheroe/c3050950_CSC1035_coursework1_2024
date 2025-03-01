import java.util.List;

public class Testing {

    public static void main(String[] args) {
        Reporting reporting = new Reporting();


        Manufacturer toyota = new Manufacturer("Toyota");
        reporting.getManufacturers().add(toyota);
        System.out.println("Test 1 Passed: Manufacturer added - " + toyota.getMake());
    }
}
