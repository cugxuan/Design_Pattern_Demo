/**
 * 首先根据产品类知道要什么配件
 * 知道了所需配件后，就需要生产配件了，定义一个生产配件的抽象建造者接口。
 */
public interface Builder {
    String buildEngine();
    String buildTyre();
    String buildSeat();
}
