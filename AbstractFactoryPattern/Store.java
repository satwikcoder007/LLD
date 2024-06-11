package AbstractFactoryPattern;

public class Store{
    ProductA a;
    ProductB b;
    Factory f;
    Store(Factory ob){
        f= ob;
    }
    private void createProduct(){
        a = f.createA();
        b = f.createB();
    }
    void getProduct(){
        createProduct();
        System.out.println(a.description);
        System.out.println(b.description);
    }
}