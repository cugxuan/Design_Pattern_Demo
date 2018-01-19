public class Main {
    public static void main(String[] args){
        FactoryI factoryA = new FactoryA();
        ProductI productA = factoryA.create();
        productA.productName();
        //
        FactoryI factoryB = new FactoryB();
        ProductI productB = factoryB.create();
        productB.productName();
    }
}
