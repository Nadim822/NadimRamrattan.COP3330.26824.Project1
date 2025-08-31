// Nadim Ramrattan
// Course: Cop3330
// Date: 1/18/2025
// Program Objective: Demonstrating classes and objects using restaurant classes
// Pizza Hut Class
class PizzaHut {
    // Fields
    private String pizzaSize;
    private int numberOfToppings;
    private boolean hasStuffedCrust;

    // Constructor
    public PizzaHut(String pizzaSize, int numberOfToppings, boolean hasStuffedCrust) {
        this.pizzaSize = pizzaSize;
        this.numberOfToppings = numberOfToppings;
        this.hasStuffedCrust = hasStuffedCrust;
    }

    // Overloaded constructor with default values
    public PizzaHut() {
        this(null, 0, false);
    }

    // Get and set methods
    public String getPizzaSize() { return pizzaSize; }
    public void setPizzaSize(String pizzaSize) { this.pizzaSize = pizzaSize; }

    public int getNumberOfToppings() { return numberOfToppings; }
    public void setNumberOfToppings(int numberOfToppings) { this.numberOfToppings = numberOfToppings; }

    public boolean isHasStuffedCrust() { return hasStuffedCrust; }
    public void setHasStuffedCrust(boolean hasStuffedCrust) { this.hasStuffedCrust = hasStuffedCrust; }

    // Custom method
    public void promoteCheesyCrust() {
        System.out.println("Try our delicious stuffed crust pizza at Pizza Hut!");
    }

    // Print method
    public void printDetails() {
        System.out.println("Pizza Hut - Size: " + pizzaSize + ", Toppings: " + numberOfToppings + ", Stuffed Crust: " + hasStuffedCrust);
    }
}
