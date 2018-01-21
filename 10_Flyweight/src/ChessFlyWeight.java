//FlyWeight抽象享元类
public interface ChessFlyWeight {
    String getColor();//获取颜色，内部状态
    void display(Coordinate c);//展示位置，外部状态
}
