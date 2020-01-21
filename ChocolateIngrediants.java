package Structural.Decorator;

class ChocolateIngrediants extends Ingrediants {
    double price = .50;

    ChocolateIngrediants(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    String getDescription() {
        return dessert.getDescription() + ", chocolate";
    }

    @Override
    double getPrice() {
        return price + dessert.getPrice();
    }
}
