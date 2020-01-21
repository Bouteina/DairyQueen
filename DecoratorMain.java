package Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
       Dessert iceCream = new IceCream() ;
       Dessert caffeMiel = new Coffee() ;

        System.out.println(iceCream);
        System.out.println(caffeMiel);
       iceCream = new NutsIngrediants(iceCream);
        System.out.println(iceCream);
       caffeMiel = new Honey(caffeMiel);
        System.out.println(caffeMiel);
    }
}
