import coffeeMachine.UIBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualUserInterface extends UIBase implements ActionListener {

    private JLabel label;
    private JPanel contentPane;
    private JButton buttonCancel;
    private JRadioButton turnOnRadioButton;
    private JRadioButton turnOffRadioButton;
    private JFormattedTextField statusField;
    private MultiWindowDialog dialog;

    public VirtualUserInterface() {

        generateObjects();

        addObjectsToPane();
        configureListeners();
        configureRadioButtons();
        actionPerformed(null);
    }

    private void generateObjects() {
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

        ImageIcon icon = new ImageIcon("./images/control.jpg");
        label = new JLabel(icon);
    }


    private void configureListeners() {
        turnOnRadioButton.addActionListener(this);
        turnOffRadioButton.addActionListener(this);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        if (turnOnRadioButton.isSelected()) {
            statusField.setValue("Working...");
            statusField.setBackground(Color.RED);
            startAll();
        } else {
            statusField.setValue("Switched Off...");
            statusField.setBackground(Color.BLACK);
            stopAll();
        }
    }


    private void addObjectsToPane() {
        Box box = Box.createVerticalBox();
        box.add(label);
        box.add(turnOnRadioButton);
        box.add(turnOffRadioButton);
        box.add(statusField);
        box.add(buttonCancel);
        contentPane.add(box);
        dialog.add(contentPane);
    }

    private void configureRadioButtons() {
        ButtonGroup group = new ButtonGroup();
        group.add(turnOffRadioButton);
        group.add(turnOnRadioButton);
        turnOffRadioButton.setSelected(true);
    }

    public boolean isVisible(){
        return dialog.isShowing();
    }


    public void showUI() {
        dialog.showDialog();
    }

}
