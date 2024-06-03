package StratagyPattern;

interface FlyBehaviour{
    public void fly();
}
interface QuackBehaviour{
    public void quack();
}

class FlyWithWings implements  FlyBehaviour{
    public void fly(){
        System.out.println(" is flying with wings");
    }
}
class NoFly implements  FlyBehaviour{
    public void fly(){
        System.out.println(" cannot fly");
    }
}

class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(" make quack sound");
    }
}
class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(" make squeak sound");
    }
}
class NoQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(" make no sound");
    }
}
