public class Main {
    public static int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 }; // 预设数据数组
    public static void main(String[] args) {
	// write your code here
        AbstractSort s = new ConcreteSort();
        s.showSortResult(a);
    }
    /**
     * 定义一个操作中算法的框架，而将一些步骤延迟到子类中，使得子类可以不改变算法的结构即可重定义该算法中的某些特定步骤。
     */
}
