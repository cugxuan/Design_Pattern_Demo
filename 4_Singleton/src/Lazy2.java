/**
 * 通过synchronized来使线程之间同步
 */
public class Lazy2 {
    private Lazy2(){}
    private static Lazy2 lazy=null;
    // 获取单例对象
    public static synchronized Lazy2 getInstance() {
        if (lazy == null) {
            lazy = new Lazy2();
        }
        return lazy;
    }
}
