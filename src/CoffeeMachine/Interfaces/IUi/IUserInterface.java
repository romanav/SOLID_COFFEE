package CoffeeMachine.Interfaces.IUi;

import CoffeeMachine.Interfaces.IPollable;
import CoffeeMachine.Interfaces.ISwitchable;
import java.util.List;


public interface IUserInterface extends IPollable {


    void addComponent(ISwitchable boiler);

    List<ISwitchable> getComponents();
}
