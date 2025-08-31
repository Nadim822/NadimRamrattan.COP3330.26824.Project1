// Nadim Ramrattan
// Course: Cop3330
// Date: 1/18/2025
// Program Objective: Demonstrating classes and objects using restaurant classes

// Tijuana Flats Class
public class TijuanaFlats {
    // Fields
    private int salsaVarieties;
    private String hottestSauce;
    private double burritoPrice;

    // Constructor
    public TijuanaFlats(int salsaVarieties, String hottestSauce, double burritoPrice) {
        this.salsaVarieties = salsaVarieties;
        this.hottestSauce = hottestSauce;
        this.burritoPrice = burritoPrice;
    }

    // Overloaded constructor with default values
    public TijuanaFlats() {
        this(0, null, 0.0);
    }

    // Get and set methods
    public int getSalsaVarieties() { return salsaVarieties; }
    public void setSalsaVarieties(int salsaVarieties) { this.salsaVarieties = salsaVarieties; }

    public String getHottestSauce() { return hottestSauce; }
    public void setHottestSauce(String hottestSauce) { this.hottestSauce = hottestSauce; }

    public double getBurritoPrice() { return burritoPrice; }
    public void setBurritoPrice(double burritoPrice) { this.burritoPrice = burritoPrice; }

    // Custom method
    public void promoteTacoTuesday() {
        System.out.println("Don't miss Taco Tuesday at Tijuana Flats!");
    }

    // Print method
    public void printDetails() {
        System.out.println("Tijuana Flats - Salsa Varieties: " + salsaVarieties + ", Hottest Sauce: " + hottestSauce + ", Burrito Price: $" + burritoPrice);
    }
}