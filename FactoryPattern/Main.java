package FactoryPattern;

public class Main{
    public static void main(String[] args) throws Exception {
        Factory f1 = new RandomFactory();
        Factory f2 = new SpecificFactory();
        Zoo z = new Zoo(f1);
        z.getAnimal();
        z.getAnimal();
        z.getAnimal();
        z.changeFactory(f2);
        z.getAnimal();
    }
}

//Factory pattern is an object created for instantiating objects but let the subclass decide
// which object to create

//Basically in some situation we need to instantiate object bases on some logic
// so we basically encapsulate the logic and use them as required.