package FactoryPattern;

public class Zoo{
    Factory ob;
    Zoo(Factory ob){
        this.ob = ob;
    }
    void changeFactory(Factory ob){
        this.ob = ob;
    }
    void getAnimal(String s){
        Product p1 = ob.create(s);
        System.out.println("You get a "+p1.species);
    }
    void getAnimal() throws ClassNotFoundException {
        Class c = Class.forName("FactoryPattern.SpecificFactory");
        if(c.isInstance(ob)) System.out.println("give the name of the animal");
        else getAnimal(null);
    }
}