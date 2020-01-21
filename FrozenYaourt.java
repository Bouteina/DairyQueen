package Structural.Decorator;

class FrozenYaourt extends Dessert {
    double price = 1.30;

    FrozenYaourt() {
        description = "Frozen Yogurt ice cream";
    }

    @Override
    double getPrice() {
        return price;
    }
}
