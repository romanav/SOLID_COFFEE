import coffeeMachine.UIBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualVessel extends UIBase implements ActionListener {


    private final JLabel label;
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

        ImageIcon icon = new ImageIcon("/home/romanav/IdeaProjects/Coffee Machine/images/plot.jpg");
        label = new JLabel(icon);

        addObjectsToPane();

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
