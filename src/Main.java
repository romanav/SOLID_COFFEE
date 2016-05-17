public class Main {

    public static void main(String[] args) {

        VirtualUserInterface demo = new VirtualUserInterface();
        VirtualBoiler boiler = new VirtualBoiler();
        VirtualVessel vessel = new VirtualVessel();

        boiler.showUI();
        demo.showUI();
        vessel.showUI();


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
