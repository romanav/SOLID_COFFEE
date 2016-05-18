package coffeeMachine.Interfaces.IHotWaterSource;

import coffeeMachine.Interfaces.IPollable;
import coffeeMachine.Interfaces.ISwitchable;

public interface IHotWaterSource extends IHotWaterSourceTemperatureControl, IWaterFlowControl, ISwitchable, IPollable {


}
