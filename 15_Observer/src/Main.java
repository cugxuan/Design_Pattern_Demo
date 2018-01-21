public class Main {

    public static void main(String[] args) {
        // write your code here
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }
    /**
     * output:
     * Attached an observer
     * 主题状态为：new state
     * 状态为：new state
     */
}
