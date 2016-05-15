import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        final SwingGui userDialog = new SwingGui();
        final VesselUi vesselDialog = new VesselUi();

        userDialog.pack();
        vesselDialog.pack();

        userDialog.setModal(true);
        vesselDialog.setModal(true);

        runInAnotherThread(userDialog);
        runInAnotherThread(vesselDialog);

    }

    private static void runInAnotherThread(final JDialog dialog) {
        Runnable dialogDisplayThread = new Runnable() {
            public void run() {
                dialog.setVisible(true);
            }
        };

        new Thread(dialogDisplayThread).start();
    }
}
