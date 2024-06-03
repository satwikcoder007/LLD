// the problem statement is that we have many duck and each duck have different properties
//implement that
//the basic principle that we are using is that we encapsulate the thing(property) that varies often
// in this case the flying and quacking pattern may vary thus we will encapsulate it

package StratagyPattern;

public class Main{
    public static void main(String[] args) {
        PlasticDuck d1 = new PlasticDuck();
        NormalDuck d2 = new NormalDuck();
        WoodenDuck d3 = new WoodenDuck();

        d1.performFly();
        d1.performQuack();

        d2.performFly();
        d2.performQuack();

        d3.performFly();
        d3.performQuack();
    }
}


//Here we can add one more function inside the duck class to change the behavoir of the ducks
// dynamically
