import CoffeeMachine.UIBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UiDemo extends UIBase implements ActionListener {

    private JPanel contentPane;
    private JButton buttonCancel;
    private JRadioButton turnOnRadioButton;
    private JRadioButton turnOffRadioButton;
    private JFormattedTextField statusField;
    private MultiWindowDialog dialog;

    public UiDemo() {

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
        contentPane.add(turnOnRadioButton);
        contentPane.add(turnOffRadioButton);
        contentPane.add(statusField);
        contentPane.add(buttonCancel);
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
