package StratagyPattern;

class NormalDuck extends Duck
{
    public NormalDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}

class PlasticDuck extends Duck{
    public PlasticDuck(){
        flyBehaviour = new NoFly();
        quackBehaviour = new Squeak();
    }
}
class WoodenDuck extends Duck{
    public  WoodenDuck(){
        flyBehaviour = new NoFly();
        quackBehaviour = new NoQuack();
    }
}
