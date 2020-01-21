package Structural.Decorator;

class NutsIngrediants extends Ingrediants {
    double price = .30;

    NutsIngrediants(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    String getDescription() {
        return dessert.getDescription() + ", nuts";
    }

    @Override
    double getPrice() {
        return price + dessert.getPrice();
    }
}
