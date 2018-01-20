/**
 * 饿汉式单例类，在类初始化时进行实例化
 */
public class Hungery {
    private Hungery(){}
    public static final Hungery hungery = new Hungery();
    //获取单例对象
    public static Hungery getInstance(){
        return hungery;
    }
}
