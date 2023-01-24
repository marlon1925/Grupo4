import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class v1 extends javax.swing.JFrame {
    private JPanel panel1;
    private JSlider slider1;
    private JLabel l1;
    private JPasswordField passwordField1;
    private JButton Iniciar;
    private JLabel l2;

    public v1(){
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                l1.setText("El valor es: " + slider1.getValue());
            }
        });

        Iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l2.setText("La clave es: " + passwordField1.getText());
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("v1");
        frame.setContentPane(new v1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
