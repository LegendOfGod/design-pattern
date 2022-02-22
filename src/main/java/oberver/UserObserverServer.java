package oberver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lqb
 * @date 2022/2/22 16:21
 */
public class UserObserverServer implements ObserverServer{
    List<Observer> observers = new ArrayList<>();
    String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.updateMessage(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
