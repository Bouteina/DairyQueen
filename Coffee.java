package Structural.Decorator;

public class Coffee extends Dessert {
    double price =  1.90 ;

    Coffee() {
        description = "coffe";
    }

    @Override
    double getPrice() {
        return price;
    }
}
