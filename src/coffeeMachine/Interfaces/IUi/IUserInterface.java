package coffeeMachine.Interfaces.IUi;

import coffeeMachine.Interfaces.IPollable;
import coffeeMachine.Interfaces.ISwitchable;
import java.util.List;


public interface IUserInterface extends IPollable {


    void addComponent(ISwitchable boiler);

    List<ISwitchable> getComponents();
}
