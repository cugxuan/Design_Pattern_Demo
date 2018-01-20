/**
 * 静态内部类
 * 这种比2,3两种都好一点，即实现了线程，又避免了同步带来的性能影响
 */
public class Lazy4 {
    private static class LazyHolder{
        private  static final Lazy4 INSTANCE = new Lazy4();
    }
    private Lazy4(){}
    public static final Lazy4 getInstance(){
        return LazyHolder.INSTANCE;
    }
}
