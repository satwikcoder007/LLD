package DecoratorPattern;


class Milk extends AddOnDecorator{
    Beverage ob;
    Milk(Beverage ob){
        this.des = "Milk";
        this.ob = ob;
    }

    @Override
    public String description() {
        return ob.description()+", "+this.des;
    }

    @Override
    public int cost() {
        return 5+ob.cost();
    }
}
class Mocha extends AddOnDecorator{
    Beverage ob;
    Mocha(Beverage ob){
        this.des = "Mocha";
        this.ob = ob;
    }
    public String description() {
        return ob.description()+", "+this.des;
    }
    @Override
    public int cost() {
        return 15+ob.cost();
    }
}
class Soy extends AddOnDecorator{
    Beverage ob;
    Soy(Beverage ob){
        this.des = "Soy";
        this.ob = ob;
    }
    public String description() {
        return ob.description()+", "+this.des;
    }
    @Override
    public int cost() {
        return 30+ob.cost();
    }
}
