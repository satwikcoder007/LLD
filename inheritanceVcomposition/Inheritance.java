package inheritanceVcomposition;

abstract class Bird1{
    String name;
    abstract void fly();
}
class Crow extends Bird1{
    Crow(){
        this.name = "Crow";
    }

    @Override
    void fly() {
        System.out.println("Fly with wings");
    }
}
//now the flying behaviour might vary for different species of bird
//thus to accomplish this we need to override all the subclasses of the bird for their fly behaviour
class Penguin extends Bird1{
    Penguin(){
        this.name = "Penguin";
    }

    @Override
    void fly() {
        System.out.println("Fly with wings");
    }
}
//..............
