package oberver;

/**
 * @author lqb
 * @date 2022/2/22 16:22
 */
public class UserObserver implements Observer{
    private String message;
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void updateMessage(String message) {
        this.message = message;
        read();
    }

    public void read(){
        System.out.println(name+"收到消息："+message);
    }
}
