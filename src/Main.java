public class Main {

    public static void main(String[] args) {

        VirtualUserInterface ui = new VirtualUserInterface();
        VirtualBoiler boiler = new VirtualBoiler();
        VirtualVessel vessel = new VirtualVessel(boiler);

        ui.addComponent(boiler);
        ui.addComponent(vessel);

        ui.showUI();
        boiler.showUI();
        vessel.showUI();

        while (ui.isVisible()) {
            ui.poll();
            boiler.poll();
            vessel.poll();
        }
    }
}
