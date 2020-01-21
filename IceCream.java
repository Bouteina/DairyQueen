package Structural.Decorator;

class IceCream extends Dessert {
    double price = 1.45;

    IceCream() {
        description = "Rolled ice cream";
    }

    @Override
    double getPrice() {
        return price;
    }
}
