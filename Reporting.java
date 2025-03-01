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


}
