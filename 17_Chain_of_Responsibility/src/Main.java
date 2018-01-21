public class Main {

    public static void main(String[] args) {
	// write your code here
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }
    /**
     * output:
     * 放过请求
     * 处理请求
     */
}
