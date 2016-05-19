import coffeeMachine.UIBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualBoiler extends UIBase implements ActionListener {


    private JPanel contentPane;
    private JButton buttonCancel;
    private MultiWindowDialog dialog;
    private JLabel label;

    public VirtualBoiler() {
        createUiObjects();
        addObjectsToPane();
    }

    private void createUiObjects() {
        dialog = new MultiWindowDialog();
        contentPane = new JPanel(new GridLayout(0, 1));
        buttonCancel = new JButton("Exit");
        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        ImageIcon icon = new ImageIcon("/home/romanav/IdeaProjects/Coffee Machine/images/boiler.jpg");
        label = new JLabel(icon);
    }

    private void addObjectsToPane() {
        Box box = Box.createVerticalBox();
        box.add(label);
        box.add(buttonCancel);
        contentPane.add(box);
        dialog.add(contentPane);
    }

    public void showUI() {
        dialog.showDialog();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
