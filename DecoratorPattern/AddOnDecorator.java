package DecoratorPattern;

public class AddOnDecorator extends Beverage{
    @Override
    public int cost() {
        return 0;
    }
}

// the addon decorator is both is a Beverage and has a Beverage
// has an object because it kind of wrap a Beverage i.e. it takes a beverage as a parameter and perform operations on it
// is an object to support multiple layer of decoration.