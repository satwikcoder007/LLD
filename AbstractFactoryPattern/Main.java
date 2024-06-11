package AbstractFactoryPattern;

class Main{
    public static void main(String[] args) {
        Factory f1 = new Factory1();
        Factory f2 = new Factory2();
        Store s1 = new Store(f2);
        s1.getProduct();
    }
}
//Abstract factory pattern provide us interface to create family of related or dependent obj
//without specifying their concrete classes

//The main difference between abstract factory and factory is that that general factory only contain
//single factory method and use to create similar type of concrete object

//But  abstractFactory  is used to create related objects and each Concrete Factory create a particular
// pair of concrete objects

//Actually i do not understand the difference.
