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
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }


//        final SwingGui userDialog = new SwingGui();
//        final VesselUi vesselDialog = new VesselUi();
//        final VirtualBoiler boilerDialog = new VirtualBoiler();
//
//        configureDialog(userDialog);
//        configureDialog(vesselDialog);
//        configureDialog(boilerDialog);
//
//        runInAnotherThread(boilerDialog);
//        runInAnotherThread(userDialog);
//        runInAnotherThread(vesselDialog);
    }

//    private static void configureDialog(JDialog userDialog) {
//        userDialog.pack();
//        userDialog.setModal(true);
//    }
//
//    private static void runInAnotherThread(final JDialog dialog) {
//        Runnable dialogDisplayThread = new Runnable() {
//            public void run() {
//                dialog.setVisible(true);
//            }
//        };
//        new Thread(dialogDisplayThread).start();
//    }
}
