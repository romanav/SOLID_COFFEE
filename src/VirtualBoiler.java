import coffeeMachine.BoilerBase;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualBoiler extends BoilerBase implements ActionListener {


    private JPanel contentPane;
    private JButton buttonCancel;
    private MultiWindowDialog dialog;
    private JLabel label;
    private JFormattedTextField statusField;

    public VirtualBoiler() {
        createUiObjects();
        addObjectsToPane();
    }

    @Override
    public void poll() {
        super.poll();
        if (isOn())
            statusField.setBackground(Color.RED);
        else
            statusField.setBackground(Color.BLACK);
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

        statusField = new JFormattedTextField();
    }

    private void addObjectsToPane() {
        Box box = Box.createVerticalBox();
        box.add(label);
        box.add(statusField);
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
