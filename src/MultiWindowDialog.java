import javax.swing.*;

public class MultiWindowDialog extends JDialog {

    public MultiWindowDialog() {
        this.setModalityType(null);
        this.setModal(false);
    }


    public void showDialog() {
        this.pack();
        runInAnotherThread(this);
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
