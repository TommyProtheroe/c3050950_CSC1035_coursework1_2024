import java.util.ArrayList;
import java.util.List;

/**
 * The Reporting class manages a collection of manufacturers and provides
 * methods to analyze and generate reports based on car models and sales data.
 */
public class Reporting {
    private List<Manufacturer> manufacturers = new ArrayList<>();

    /**
     * Retrieves the list of manufacturers being tracked in the reporting system.
     *
     * @return A list of Manufacturer objects.
     */
    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    /**
     * Finds and returns the most expensive car model sold across all manufacturers.
     *
     * @return The CarModel with the highest sales price, or null if no models exist.
     */
    public CarModel getMostExpensiveCarSold() {
        CarModel mostExpensive = null;

        for (int i = 0; i < manufacturers.size(); i++) {
            CarModel expensiveCar = manufacturers.get(i).getMostExpensiveCar();

            if (expensiveCar != null) {
                if (mostExpensive == null || expensiveCar.getSalesPrice() > mostExpensive.getSalesPrice()) {
                    mostExpensive = expensiveCar;
                }
            }
        }
        return mostExpensive;
    }

    /**
     * Determines the manufacturer with the highest total revenue from sales
     * of a given car type.
     *
     * @param carType The type of car (hatchback, saloon, or estate).
     * @return The Manufacturer with the highest revenue, or null if no data is available.
     */
    public Manufacturer getManufacturerWithHighestRevenue(String carType) {
        Manufacturer topManufacturer = null;
        double highestRevenue = 0.0;

        for (int i = 0; i < manufacturers.size(); i++) {
            double revenue = manufacturers.get(i).getTotalRevenue(carType);

            if (revenue > highestRevenue) {
                highestRevenue = revenue;
                topManufacturer = manufacturers.get(i);
            }
        }
        return topManufacturer;
    }

    /**
     * Retrieves a list of all car models across all manufacturers that have
     * a sales price greater than a specified amount.
     *
     * @param minPrice The minimum price threshold.
     * @return A list of CarModel objects with a price above the given value.
     */
    public List<CarModel> getAllCarModelsAbovePrice(double minPrice) {
        List<CarModel> expensiveCars = new ArrayList<>();

        for (int i = 0; i < manufacturers.size(); i++) {
            expensiveCars.addAll(manufacturers.get(i).getCarModelsAbovePrice(minPrice));
        }
        return expensiveCars;
    }
}
