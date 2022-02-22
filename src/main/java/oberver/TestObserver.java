package oberver;

/**
 * @author lqb
 * @date 2022/2/22 16:30
 */
public class TestObserver {
    public static void main(String[] args) {
        UserObserver observer1 = new UserObserver("张三");
        UserObserver observer2 = new UserObserver("李四");
        UserObserverServer userObserverServer = new UserObserverServer();
        userObserverServer.registerObserver(observer1);
        userObserverServer.registerObserver(observer2);
        userObserverServer.setMessage("发布第一条消息");
        userObserverServer.setMessage("发布第二条消息");
    }
}
