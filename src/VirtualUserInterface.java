import coffeeMachine.UIBase;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class VirtualUserInterface extends UIBase implements ActionListener {

    private JPanel contentPane;
    private JButton buttonCancel;
    private JRadioButton turnOnRadioButton;
    private JRadioButton turnOffRadioButton;
    private JFormattedTextField statusField;
    private MultiWindowDialog dialog;

    public VirtualUserInterface() {

        dialog = new MultiWindowDialog();
        contentPane = new JPanel(new GridLayout(0, 1));

        buttonCancel = new JButton("Exit");
        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        turnOnRadioButton = new JRadioButton("Turn On");
        turnOffRadioButton = new JRadioButton("Turn Off");

        statusField = new JFormattedTextField();

        ImageIcon icon = new ImageIcon("/home/romanav/IdeaProjects/Coffee Machine/images/control.jpg");
        JLabel label = new JLabel(icon);
        contentPane.add(label);

        Box box = Box.createVerticalBox();
        box.add(turnOnRadioButton);
        box.add(turnOffRadioButton);
        box.add(statusField);
        box.add(buttonCancel);

        contentPane.add(box);

        addObjectsToPane();
        configureRadioButtons();
        configureListeners();

    }


    private void configureListeners() {
        turnOnRadioButton.addActionListener(this);
        turnOffRadioButton.addActionListener(this);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        if (turnOnRadioButton.isSelected())
            statusField.setValue("Working...");
        else
            statusField.setValue("Switched Off...");
    }


    private void addObjectsToPane() {


        dialog.add(contentPane);
    }

    private void configureRadioButtons() {
        ButtonGroup group = new ButtonGroup();
        group.add(turnOffRadioButton);
        group.add(turnOnRadioButton);
        turnOffRadioButton.setSelected(true);
    }


    public void showUI() {
        dialog.showDialog();
    }

}
