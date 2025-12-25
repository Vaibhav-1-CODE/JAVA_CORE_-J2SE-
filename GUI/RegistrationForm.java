import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {

    JTextField txtRoll, txtName;
    JComboBox<String> cmbClass;
    JRadioButton rbRegular, rbExternal;
    JButton btnSubmit, btnReset;
    ButtonGroup bgType;

    public RegistrationForm() {

        setTitle("Registration Form");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Main Panel with Border
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createTitledBorder("Registration Form"));
        panel.setBounds(20, 10, 400, 280);
        add(panel);

        // Roll No
        JLabel lblRoll = new JLabel("Roll No");
        lblRoll.setBounds(30, 40, 100, 25);
        panel.add(lblRoll);

        txtRoll = new JTextField();
        txtRoll.setBounds(140, 40, 180, 25);
        panel.add(txtRoll);

        // Name
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(30, 80, 100, 25);
        panel.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(140, 80, 180, 25);
        panel.add(txtName);

        // Class
        JLabel lblClass = new JLabel("Class");
        lblClass.setBounds(30, 120, 100, 25);
        panel.add(lblClass);

        String classes[] = { "FY", "SY", "TY" };
        cmbClass = new JComboBox<>(classes);
        cmbClass.setBounds(140, 120, 120, 25);
        panel.add(cmbClass);

        // Type (Radio Buttons)
        JLabel lblType = new JLabel("Type");
        lblType.setBounds(30, 160, 100, 25);
        panel.add(lblType);

        rbRegular = new JRadioButton("Regular");
        rbRegular.setBounds(140, 160, 80, 25);

        rbExternal = new JRadioButton("External");
        rbExternal.setBounds(230, 160, 100, 25);

        bgType = new ButtonGroup();
        bgType.add(rbRegular);
        bgType.add(rbExternal);

        panel.add(rbRegular);
        panel.add(rbExternal);

        // Buttons
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 210, 80, 30);
        panel.add(btnSubmit);

        btnReset = new JButton("Reset");
        btnReset.setBounds(200, 210, 80, 30);
        panel.add(btnReset);

        // Reset Button Action
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtRoll.setText("");
                txtName.setText("");
                cmbClass.setSelectedIndex(0);
                bgType.clearSelection();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
