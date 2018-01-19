public class FactoryA implements FactoryI {
    @Override
    public ProductI create() {
        return new ProductA();
    }
}