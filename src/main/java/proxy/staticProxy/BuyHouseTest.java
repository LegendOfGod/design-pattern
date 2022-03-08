package proxy.staticProxy;

import proxy.BuyHouse;
import proxy.BuyHouseImpl;

/**
 * @author lqb
 * @date 2022/3/8 10:58
 */
public class BuyHouseTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
