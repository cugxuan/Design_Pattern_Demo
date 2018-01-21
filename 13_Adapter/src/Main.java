public class Main {

    public static void main(String[] args) {
	// write your code here
        Adapter adapter = new Adapter();
        //适配器实现源角色没有的方法
        adapter.sampleOperation2();
    }
    /**
     * 目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
     * 源(Adapee)角色：现在需要适配的接口。
     * 适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
     */

}
