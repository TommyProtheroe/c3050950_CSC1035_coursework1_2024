public class CarModel {

    private String name;
    private double weight;
    private double sales_price;
    private int number_sold;
    private String type;

    public CarModel(String name, double weight, double sales_price, int number_sold, String type) {
        this.name = name;
        this.weight = weight;
        this.sales_price = sales_price;
        this.number_sold = number_sold;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSalesPrice() {
        return sales_price;
    }

    public int getNumberSold() {
        return number_sold;
    }

    public String getType() {
        return type;
    }

}

