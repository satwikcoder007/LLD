package  StratagyPattern;
import StratagyPattern.FlyBehaviour;
import StratagyPattern.QuackBehaviour;

public class Duck
{
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    void performQuack(){
        quackBehaviour.quack();
    }
    void performFly(){
        flyBehaviour.fly();
    }
}