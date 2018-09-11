import javax.swing.*;
public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Login loginPanal = new Login();
        frame.setContentPane(loginPanal.getMainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
