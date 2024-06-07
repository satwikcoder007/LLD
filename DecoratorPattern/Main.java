package DecoratorPattern;

class Main{
    public static void main(String[] args) {
        Beverage b1 = new Americano();
        b1 = new Milk(b1);
        b1 = new Mocha(b1);
        System.out.println(b1.description());
        System.out.println("cost="+b1.cost());

        Beverage b2 = new Espresso();
        b2 = new Soy(b2);
        b2 = new Mocha(b2);
        System.out.println(b2.description());
        System.out.println("cost="+b2.cost());
    }
}

// A decorator pattern is used to attach additional responsibility to an object dynamically
// it is used to extend the behaviour of an object at runtime

// for example, we can extend the plain mocha(Beverage obj) with milk then can further extend the order with mocha at runtime
// without violation the open-close principle and interface segregation principle