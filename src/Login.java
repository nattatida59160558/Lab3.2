import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserLogin;
    private JPasswordField txtpwd;
    private JButton btnsubmit;
    private JButton btnclear;
    private JPanel mainPanel;

    public Login() {
        btnsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, txtUserLogin.getText()
                        +" "+new String(txtpwd.getPassword()));
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              txtUserLogin.setText("");
              txtpwd.setText("");

            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
