package AbstractFactoryPattern;

class Factory1 implements Factory{
    @Override
    public ProductA createA() {
        return new ProductA1();
    }

    @Override
    public ProductB createB() {
        return new ProductB1();
    }
}

class Factory2 implements Factory{
    @Override
    public ProductA createA() {
        return new ProductA2();
    }

    @Override
    public ProductB createB() {
        return new ProductB2();
    }
}
class Factory3 implements Factory{
    @Override
    public ProductA createA() {
        return new ProductA3();
    }

    @Override
    public ProductB createB() {
        return new ProductB3();
    }
}