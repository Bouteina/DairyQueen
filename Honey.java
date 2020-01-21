package Structural.Decorator;

class Honey extends Ingrediants {
    double price = .10;

    Honey(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    String getDescription() {
        return dessert.getDescription() + ", Honey";
    }

    @Override
    double getPrice() {
        return price + dessert.getPrice();
    }
}
