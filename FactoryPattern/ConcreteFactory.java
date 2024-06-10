package FactoryPattern;

import java.util.Random;

class RandomFactory implements Factory
{
    @Override
    public Product create(String s) {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        if(randomNumber == 1) return new Dog();
        if(randomNumber == 2) return new Cat();
        else return new Snake();
    }
    public Product create() {
        return create(null);
    }
}
class SpecificFactory implements Factory{
    @Override
    public Product create(String s) {
        if(s.equals("dog")) return new Dog();
        if(s.equals("snake")) return new Snake();
        else return new Cat();
    }
}