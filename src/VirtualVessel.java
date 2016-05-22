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
    private JRadioButton takeVesselRadioButton;
    private JRadioButton putVesselRadioButton;

    public VirtualVessel(IWaterFlowControl flowControl) {
        super(flowControl);
        generateObjects();
        addObjectsToPane();
        configureRadioButtons();

    }


    private void configureRadioButtons() {
        ButtonGroup group = new ButtonGroup();
        group.add(takeVesselRadioButton);
        group.add(putVesselRadioButton);
        putVesselRadioButton.setSelected(true);

        takeVesselRadioButton.addActionListener(this);
        putVesselRadioButton.addActionListener(this);
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


        takeVesselRadioButton = new JRadioButton("Take vessel");
        putVesselRadioButton = new JRadioButton("Put Vessel");

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

        box.add(takeVesselRadioButton);
        box.add(putVesselRadioButton);

        box.add(buttonCancel);
        contentPane.add(box);
        dialog.add(contentPane);
    }

    public void showUI() {
        dialog.showDialog();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (takeVesselRadioButton.isSelected())
            removeVessel();
        else
            removeVessel();
    }
}
