import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab12 extends JFrame{
    private JTextField txtHeight;
    private JTextField txtLength;
    private JTextField txtWidth;
    private JLabel volumeOfParallelepiped;
    private JLabel lblResult;
    private JButton btnCalculate;
    private JButton btnClear;
    private JLabel lblWidth;
    private JLabel lblLength;
    private JLabel lblHeight;
    private JPanel Lab12Panel;

    public Lab12() {

        setContentPane(Lab12Panel);
        setTitle("Обрахунок об'єму паралелепіпеда");
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float length, width, height, result;
                String lengthText = txtLength.getText();
                String widthText = txtWidth.getText();
                String heightText = txtHeight.getText();

                if (lengthText.isEmpty()) {
                    lengthText = "0";
                }
                if (widthText.isEmpty()) {
                    widthText = "0";
                }
                if (heightText.isEmpty()) {
                    heightText = "0";
                }

                length = Float.parseFloat(lengthText);
                width = Float.parseFloat(widthText);
                height = Float.parseFloat(heightText);

                result = length * width * height;

                lblResult.setText(String.valueOf(result));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLength.setText("");
                txtWidth.setText("");
                txtHeight.setText("");
            }
        });
    }

    public static void main(String[] args) {

        Lab12 frame = new Lab12();

    }
}
