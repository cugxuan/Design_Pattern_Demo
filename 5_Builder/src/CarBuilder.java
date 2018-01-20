public class CarBuilder implements Builder {
    @Override
    public String buildEngine() {
        // 生产发动机
        return "发动机";
    }

    @Override
    public String buildTyre() {
        // 生产轮胎
        return "轮胎";
    }

    @Override
    public String buildSeat() {
        // 生产座椅
        return "座椅";
    }
}
