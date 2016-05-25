import coffeeMachine.BoilerBase;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualBoiler extends BoilerBase implements ChangeListener {


    private JPanel contentPane;
    private JButton buttonCancel;
    private MultiWindowDialog dialog;
    private JLabel label;
    private JFormattedTextField onOffStatusField;
    private JSlider temperatureSlider;
    private JLabel bowlingLabel;

    public VirtualBoiler() {
        createUiObjects();
        addObjectsToPane();

        setMaximumTemperature(90);
        setMinimumTemperature(60);
    }

    @Override
    public void poll() {
        super.poll();
        if (isOn())
            onOffStatusField.setBackground(Color.RED);
        else
            onOffStatusField.setBackground(Color.BLACK);


        if (isWaterFlowing())
            bowlingLabel.setText("Water open");
        else
            bowlingLabel.setText("Water closed");

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

        ImageIcon icon = new ImageIcon("./images/boiler.jpg");
        label = new JLabel(icon);

        onOffStatusField = new JFormattedTextField();

        bowlingLabel = new JLabel();

        configureTemperatureSliderObject();
    }

    private void configureTemperatureSliderObject() {
        temperatureSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 1);
        temperatureSlider.setPaintTicks(true);
        temperatureSlider.setPaintLabels(true);
        temperatureSlider.setLabelTable(temperatureSlider.createStandardLabels(10));
        temperatureSlider.addChangeListener(this);
    }

    private void addObjectsToPane() {
        Box box = Box.createVerticalBox();
        box.add(label);
        box.add(onOffStatusField);
        box.add(bowlingLabel);
        box.add(getSliderBox());
        box.add(buttonCancel);

        contentPane.add(box);
        dialog.add(contentPane);
    }

    private Component getSliderBox() {
        Box p = Box.createHorizontalBox();
        p.add(new Label("Temperature"));
        p.add(temperatureSlider);
        p.add(Box.createHorizontalGlue());
        return p;
    }

    public void showUI() {
        dialog.showDialog();
    }


    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.setTemperature(temperatureSlider.getValue());
    }


}
