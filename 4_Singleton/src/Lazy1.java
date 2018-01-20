/**
 * 懒汉式单例，在第一次调用的时候实例化自己
 * 但是没有考虑线程安全问题，当多个线程并发调用时可能会产生多个实例
 * 对其的三种改进方法：
 * Lazy2,在getInstance方法上加同步
 * Lazy3，双重检查锁定
 * Lazy4，静态内部类
 */
public class Lazy1 {
    private Lazy1(){}
    private static Lazy1 lazy=null;
    // 获取单例对象
    public static Lazy1 getInstance(){
        if(lazy == null){
            lazy = new Lazy1();
        }
        return lazy;
    }
}
