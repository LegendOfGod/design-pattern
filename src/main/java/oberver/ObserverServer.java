package oberver;

/**
 * @author lqb
 * @date 2022/2/22 16:20
 */
public interface ObserverServer {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
