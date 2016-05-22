import coffeeMachine.ContainmentBase;
import coffeeMachine.Interfaces.IHotWaterSource.IWaterFlowControl;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualVessel extends ContainmentBase implements ActionListener {


    private JLabel label;
    private JPanel contentPane;
    private JButton buttonCancel;
    private MultiWindowDialog dialog;
    private JFormattedTextField statusField;

    public VirtualVessel(IWaterFlowControl flowControl) {
        super(flowControl);
        generateObjects();
        addObjectsToPane();
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

        ImageIcon icon = new ImageIcon("/home/romanav/IdeaProjects/Coffee Machine/images/plot.jpg");
        label = new JLabel(icon);
        statusField = new JFormattedTextField();
    }


    @Override
    public void poll() {
        super.poll();
        if (isOn())
            statusField.setBackground(Color.RED);
        else
            statusField.setBackground(Color.black);
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
