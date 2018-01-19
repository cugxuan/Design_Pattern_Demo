// 简单工厂模式
public class Factory {
    public ProductI create(String productName) {
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}