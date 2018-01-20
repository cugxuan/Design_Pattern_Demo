public class Main {

    public static void main(String[] args) {
	// write your code here
        //获得单例对象，直接使用
        Lazy1.getInstance();
        //获得单例对象，直接使用
        Hungery.getInstance();
    }
    /**
     * 还有一种登记式的方法，就是将类名注册，下次直接获取
     * 可以使用哈希表（HashTable）进行使用
     * 这样使用多个单例类的时候也不会因为查找而过于降低速度
     */
}
