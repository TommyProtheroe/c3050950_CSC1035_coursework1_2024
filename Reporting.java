import java.util.ArrayList;
import java.util.List;

public class Reporting {
    List<Manufacturer> manufacturers = new ArrayList<>();

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

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

    public List<CarModel> getAllCarModelsAbovePrice(double minPrice) {
        List<CarModel> expensiveCars = new ArrayList<>();

        for (int i = 0; i < manufacturers.size(); i++) {
            List<CarModel> manufacturerCars = manufacturers.get(i).getCarModelsAbovePrice(minPrice);
        }
    }




}
