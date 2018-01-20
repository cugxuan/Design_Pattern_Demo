package SimplePrototype;

public class SimpleMain {

    public static void main(String[] args) {
        System.out.println("简单原型模式");
        // 新建一个原型对象
        ConcretePrototype1 a = new ConcretePrototype1();
        Client client = new Client(a);
        //然后使用操作获得一个新的Prototype
        Prototype b = client.operation(client.getPrototype());
        System.out.println(client.getPrototype().toString());
        System.out.println(b.toString());
        //可以看到两种对象都是SimplePrototype.ConcretePrototype1类型
        //但是是两个不同的对象，使用operation的操作进行克隆
    }
    /**
     * 原型模式属于对象的创建模式。通过给出一个原型对象来指明所有创建的对象的类型，
     * 然后用复制这个原型对象的办法创建出更多同类型的对象。这就是选型模式的用意。
     */
}
