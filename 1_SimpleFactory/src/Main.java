public class Main {
//    输出
//    product A
//    product B
    public static void main(String[] args) {
        Factory factory = new Factory();
        ProductI productA = factory.create("A");
        productA.productName();
        //
        ProductI productB = factory.create("B");
        productB.productName();
    }
}
