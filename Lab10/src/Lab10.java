import javax.swing.JFrame;

public class Lab10 {
    public static void main(String[] args) {
            // Створення фрейму як екземпляр класу JFrame
            JFrame window = new JFrame();
            // Задаємо заголовок
            window.setTitle("Повний екран");

            // Задаємо розміри вікна на весь екрна
            window.setExtendedState(JFrame.MAXIMIZED_BOTH);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Активізоване вікно
            window.setVisible(true);

            // Виводимо дані
            System.out.println("Розмір вікна у пікселях " + window.getSize());
            System.out.println("Розташування вікна по х,у " + window.getLocation());

            int state = window.getExtendedState();

            if ((state & JFrame.MAXIMIZED_BOTH) != 0) {
                System.out.println("Вікно розгорнуто на весь екран");
            }
            else {
                System.out.println("Вікно іншого розміру");
            }
    }
}