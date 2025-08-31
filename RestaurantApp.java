// Nadim Ramrattan
// Course: Cop3330
// Date: 1/18/2025
// Program Objective: Demonstrating classes and objects using restaurant classes
// Main Application Class
public class RestaurantApp {
    public static void main(String[] args) {
        // Instantiate Tijuana Flats
        TijuanaFlats tf = new TijuanaFlats(10, "Ghost Pepper", 8.99);
        tf.printDetails();
        tf.setBurritoPrice(9.49);
        tf.printDetails();
        tf.promoteTacoTuesday();

        // Instantiate Pizza Hut
        PizzaHut ph = new PizzaHut("Large", 5, true);
        ph.printDetails();
        ph.setNumberOfToppings(6);
        ph.printDetails();
        ph.promoteCheesyCrust();
    }
}