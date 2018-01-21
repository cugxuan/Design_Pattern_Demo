public class Main {

    public static void main(String[] args) {
	// write your code here
        Facade facade = new Facade();
        facade.Method();

        facade.op1();
    }
    /**
     * output：
     * Facade Method()
     * 方法3
     * 方法2
     * 方法1
     * Facade op1()
     * 方法1
     */
}
