package proxy.staticProxy;

import proxy.BuyHouse;

/**
 * @author lqb
 * @date 2022/3/8 10:55
 */
public class BuyHouseProxy implements BuyHouse {
    private final BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("我在看房");
        buyHouse.buyHouse();
        System.out.println("我入住了");
    }

}
