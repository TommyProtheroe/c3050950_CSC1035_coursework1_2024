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
    }


}
