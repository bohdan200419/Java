import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.CheckboxMenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {

        // Створення вікна
        Frame frame = new Frame("Лабораторна робота №13");
        frame.setSize(300, 200);
        frame.setLocation(500, 500);

        // Створення меню
        MenuBar myMenu = new MenuBar();

        // Створення пункту меню Файл
        Menu fileMenu = new Menu("Файл");
        // Створення підпунктів для Файл
        MenuItem newFile = new MenuItem("Новий файл");
        MenuItem saveFile = new MenuItem("Зберегти");
        MenuItem printFile = new MenuItem("Друкувати");

        // Додавання об'єктів у меню
        fileMenu.add(newFile);
        fileMenu.add(saveFile);
        fileMenu.add(printFile);

        // Створення пункту меню Правка
        Menu editMenu = new Menu("Правка");
        // Створення пункту з прапорцем
        CheckboxMenuItem insertFile = new CheckboxMenuItem("Вставити");
        // Створення підпунктів для Правка
        MenuItem formatFile = new MenuItem("Формати");
        MenuItem contentFile = new MenuItem("Вміст");
        MenuItem linkFile = new MenuItem("Посилання");

        // Додавання об'єктів у меню
        editMenu.add(insertFile);
        // Розділювач
        editMenu.addSeparator();
        editMenu.add(formatFile);
        editMenu.add(contentFile);
        editMenu.add(linkFile);

        // Додаємо пункти Файл та Правка у меню
        myMenu.add(fileMenu);
        myMenu.add(editMenu);

        // Додаємо меню у вікно
        frame.setMenuBar(myMenu);
        frame.setVisible(true);

        // Закінчення роботи проєкту
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
