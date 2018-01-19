public class Main {

    public static void main(String[] args) {
	// write your code here
        //生产1类产品
        AbstractFactory factory1=new Factory1();
        ProductAI a1=factory1.createProductA();
        a1.productName(); //输出A1
        ProductBI b1=factory1.createProductB();
        b1.productName(); //输出B1

        AbstractFactory factory2=new Factory2();
        ProductAI a2=factory2.createProductA();
        a2.productName(); //输出A2
        ProductBI b2=factory2.createProductB();
        b2.productName(); //输出B2
    }
}
