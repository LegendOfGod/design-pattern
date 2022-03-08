package proxy.cglibProxy;

import proxy.BuyHouse;
import proxy.BuyHouseImpl;

/**
 * @author lqb
 * @date 2022/3/8 11:35
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouseImpl proxyInstance = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        proxyInstance.buyHouse();
    }
}
