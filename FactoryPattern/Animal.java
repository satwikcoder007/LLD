package FactoryPattern;

abstract class Product{
    String species;
    abstract public void makeSound();
}

class Dog extends Product{

    Dog(){
        this.species = "Dog";
    }
    public void makeSound() {
        System.out.println("bark");
    }
}
class Cat extends Product{

    Cat(){
        this.species = "Cat";
    }
    public void makeSound() {
        System.out.println("mew");
    }
}
class Snake extends Product{

    Snake(){
        this.species = "Snake";
    }
    public void makeSound() {
        System.out.println("Hiss");
    }
}
//Concrete
