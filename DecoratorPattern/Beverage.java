package DecoratorPattern;

public abstract class Beverage{
    String des = "Not a drink";
    public String description(){
        return des;
    }
    public abstract int cost();
}
