public class Factory1 implements AbstractFactory {
    @Override
    public ProductAI createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductBI createProductB() {
        return new ProductB1();
    }
}