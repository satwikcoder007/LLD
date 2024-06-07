package DecoratorPattern;

class Espresso extends Beverage{
    Espresso(){
        this.des = "Espresso";
    }
    @Override
    public int cost() {
        return 20;
    }
}
class Americano extends Beverage{
    Americano(){
        this.des = "Americano";
    }
    @Override
    public int cost() {
        return 50;
    }
}
class Decaf extends Beverage{
    Decaf(){
        this.des = "Decaf";
    }
    @Override
    public int cost() {
        return 35;
    }
}




