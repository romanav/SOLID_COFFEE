import java.util.List;

public interface IUserInterface {

    void addComponent(Object component);

    List<Object> getComponents();

    void poll();
}
