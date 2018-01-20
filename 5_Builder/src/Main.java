public class Main {

    public static void main(String[] args) {
	// write your code here
        CarDirector carDirector = new CarDirector(new CarBuilder());
        Car car = carDirector.constructCar();
        System.out.println(car.getEngine()+"\n"+car.getTyre()+"\n"+car.getSeat());
    }
    /**
     * 1.Product角色:组装一辆汽车首先的有各种配件，如发动机、轮胎、座椅等。 //Car类
     * 2.Builder角色:知道了所需配件后，就需要生产配件了，定义一个生产配件的抽象建造者接口。
     * 3.ConcreteBuilder角色:实现抽象的 建造者接口生成具体的建造者，并开始生产具体的配件。
     * 4.Director角色:在生产出配件后，由指导者指导组装配件生成汽车。
     * 5.最终得到一辆汽车
     */
}
