package CoffeeMachine;


import CoffeeMachine.Interfaces.ISwitchable;
import CoffeeMachine.Interfaces.IUi.IUserInterface;

import java.util.ArrayList;
import java.util.List;


public class SimpleUI implements IUserInterface {


    private List<ISwitchable> components;

    public SimpleUI() {
        components = new ArrayList<>();
    }

    @Override
    public void poll() {
    }

    protected void startAll() {
        for (ISwitchable i : components) {
            i.turnOn();
        }
    }

    protected void stopAll() {
        for (ISwitchable i : components) {
            i.turnOff();
        }
    }

    @Override
    public void addComponent(ISwitchable boiler) {
        components.add(boiler);
    }

    public List<ISwitchable> getComponents() {
        return components;
    }
}
