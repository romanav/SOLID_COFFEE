package CoffeeMachine.Interfaces.IHotWaterSource;

import CoffeeMachine.Interfaces.IPollable;
import CoffeeMachine.Interfaces.ISwitchable;

public interface IHotWaterSource extends IHotWaterSourceTemperatureControl, IWaterFlowControl, ISwitchable, IPollable {


}
