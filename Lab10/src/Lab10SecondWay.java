import javax.swing.JFrame;
public class Lab10SecondWay extends JFrame{
    public static void main(String[] args){
        // Створення фрейму як екземпляр підкласу від класу JFrame
        Lab10SecondWay secondWindow = new Lab10SecondWay();

        // Задаємо заголовок
        secondWindow.setTitle("Повний екран");

        // Задаємо розміри вікна на весь екрна
        secondWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        secondWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Активізоване вікно
        secondWindow.setVisible(true);

        // Виводимо дані
        System.out.println("Розмір вікна у пікселях " + secondWindow.getSize());
        System.out.println("Розташування вікна по х,у " + secondWindow.getLocation());

        int state = secondWindow.getExtendedState();

        if ((state & JFrame.MAXIMIZED_BOTH) != 0) {
            System.out.println("Вікно розгорнуто на весь екран");
        }
        else {
            System.out.println("Вікно іншого розміру");
        }
    }
}
