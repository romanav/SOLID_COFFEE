import javax.swing.*;
import java.awt.event.*;

public class SwingGui extends JDialog implements ActionListener {
    private JPanel contentPane;

    private JButton buttonCancel;
    private JRadioButton turnOnRadioButton;
    private JRadioButton turnOffRadioButton;
    private JFormattedTextField statusField;

    public SwingGui() {


        setContentPane(contentPane);
        setModal(true);


        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


        configureListeners();
        configureRadioButtons();
        actionPerformed(null);

    }

    private void configureRadioButtons() {
        ButtonGroup group = new ButtonGroup();
        group.add(turnOffRadioButton);
        group.add(turnOnRadioButton);
        turnOffRadioButton.setSelected(true);
    }


    private void configureListeners() {
        turnOnRadioButton.addActionListener(this);
        turnOffRadioButton.addActionListener(this);
    }


    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        SwingGui dialog = new SwingGui();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (turnOnRadioButton.isSelected())
            statusField.setValue("Working...");
        else
            statusField.setValue("Switched Off...");

    }
}
