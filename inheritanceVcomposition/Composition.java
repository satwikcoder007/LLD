package inheritanceVcomposition;

abstract class Bird2{
    String name;
    flyable ob;  // here we are basically using an instance of flyable interface
    public void fly(){
        ob.fly();
    }
}


//behaviour
interface flyable{
    public void fly();
}

class FlyWithWings implements flyable{
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
class NoFly implements flyable{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}

//Birds
class Sparrow extends Bird2{
    Sparrow(){
        this.name = "Sparrow";
        flyable ob = new FlyWithWings();
    }
}
class Ostrich extends Bird2{
    Ostrich(){
        this.name = "Ostrich";
        flyable ob = new FlyWithWings();
    }
}


// as the fly behaviour vary greatly from bird to bird we basically took it and encapsulate it
// and use it as a object which make the design more modular and it is very easy to update and extend the behaviour.
// the bird class si composed of flyable interface.

