package Structural.Decorator;

abstract class Ingrediants extends Dessert {
    Dessert dessert;
    @Override
    abstract String getDescription();
}
