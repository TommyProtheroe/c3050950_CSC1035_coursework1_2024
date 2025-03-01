import java.util.ArrayList;
import java.util.List;

public class Manufacturer {
    private String make;
    List<CarModel> carModels = new ArrayList<>();

    public Manufacturer(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public List<CarModel> getCarModels() {
        return carModels;
    }

    public CarModel getMostExpensiveCar() {
        if (carModels.isEmpty()) {
            return null;
        }

        CarModel mostExpensive = carModels.get(0);

        for (int i = 1; i < carModels.size(); i++) {
            if (carModels.get(i).getSalesPrice() > mostExpensive.getSalesPrice()) {
                mostExpensive = carModels.get(i);
            }
        }
        return mostExpensive;
    }

    public double getTotalRevenue(String carType) {
        double totalRevenue = 0.0;

        for (int i = 0; i < carModels.size(); i++) {
            if (carModels.get(i).getType().equals(carType)) {
            }
        }
    }



}
