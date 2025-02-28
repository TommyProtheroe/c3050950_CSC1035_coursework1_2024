public class CarModel {

    private String name;
    private double weight;
    private double salesPrice;
    private int numberSold;
    private String type;

    public CarModel(String name, double weight, double salesPrice, int numberSold, String type) {
        this.name = name;
        this.weight = weight;
        this.salesPrice = salesPrice;
        this.numberSold = numberSold;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public String getType() {
        return type;
    }

}

