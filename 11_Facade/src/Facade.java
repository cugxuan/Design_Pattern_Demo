//Subsystem Classes : 实现子系统功能。在不感知 Facade 的情况下，处理 Facade 对象分配的工作

public class Facade {
    private Class1 one = new Class1();
    private Class2 two = new Class2();
    private Class3 three = new Class3();

    public void op1() {
        System.out.println("Facade op1()");
        one.op1();
    }

    public void op2() {
        System.out.println("Facade op2()");
        two.op2();
    }

    public void op3() {
        System.out.println("Facade op3()");
        three.op3();
    }

    public void Method() {
        System.out.println("Facade Method()");
        three.op3();
        two.op2();
        one.op1();
    }
}
