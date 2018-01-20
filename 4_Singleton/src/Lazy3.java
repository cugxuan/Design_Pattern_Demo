/**
 * 双重检查锁定
 */
public class Lazy3 {
    private Lazy3(){}
    private static Lazy3 lazy=null;
    // 获取单例对象
    public static Lazy3 getInstance() {
        if (lazy == null) {
            synchronized (Lazy3.class) {
                if (lazy == null) {
                    lazy = new Lazy3();
                }
            }
        }
        return lazy;
    }
}
