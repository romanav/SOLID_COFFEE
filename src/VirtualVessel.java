import CoffeeMachine.UIBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualVessel extends UIBase implements ActionListener {


    private JPanel contentPane;
    private JButton buttonCancel;
    private MultiWindowDialog dialog;

    public VirtualVessel() {
        dialog = new MultiWindowDialog();
        contentPane = new JPanel(new GridLayout(0, 1));

        buttonCancel = new JButton("Exit");

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        addObjectsToPane();


    }

    private void addObjectsToPane() {
        contentPane.add(buttonCancel);
        dialog.add(contentPane);
    }

    public void showUI() {
        dialog.showDialog();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
