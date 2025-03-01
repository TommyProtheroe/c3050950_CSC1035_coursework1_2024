/**
 * Represents a car model with details such as name, weight, price, number sold, and type.
 */
public class CarModel {

    private String name;
    private double weight;
    private double salesPrice;
    private int numberSold;
    private String type;

    /**
     * Constructs a CarModel object.
     *
     * @param name The name of the car model.
     * @param weight The weight of the car in kg.
     * @param salesPrice The sales price of the car in pounds (£).
     * @param numberSold The number of cars sold.
     * @param type The type of car (hatchback, saloon, or estate).
     */
    public CarModel(String name, double weight, double salesPrice, int numberSold, String type) {
        this.name = name;
        this.weight = weight;
        this.salesPrice = salesPrice;
        this.numberSold = numberSold;
        this.type = type;
    }

    /**
     * Gets the name of the car model.
     *
     * @return The name of the car model.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the weight of the car in kg.
     *
     * @return The weight of the car.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets the sales price of the car in pounds (£).
     *
     * @return The sales price of the car.
     */
    public double getSalesPrice() {
        return salesPrice;
    }

    /**
     * Gets the number of cars sold.
     *
     * @return The number of cars sold.
     */
    public int getNumberSold() {
        return numberSold;
    }

    /**
     * Gets the type of car.
     *
     * @return The type of car (hatchback, saloon, or estate).
     */
    public String getType() {
        return type;
    }
}
