import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lab11 {
    public static void main(String[] args) {

        // Створюємо вікно
        JFrame window = new JFrame("Курсор KeyEvent");
        JLabel label = new JLabel("Реалізація завдання: Натиснення клавіші управління курсором");
        window.add(label);
        window.pack();
        window.setVisible(true);

        // Додаємо подію прослуховування клавіш управління
        window.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                    case KeyEvent.VK_DOWN:
                    case KeyEvent.VK_LEFT:
                    case KeyEvent.VK_RIGHT:
                        System.out.println("Натиснено клавішу управління курсором: " + KeyEvent.getKeyText(e.getKeyCode()));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
