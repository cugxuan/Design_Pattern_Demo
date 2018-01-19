public class FactoryB implements FactoryI {
    @Override
    public ProductI create() {
        return new ProductB();
    }
}