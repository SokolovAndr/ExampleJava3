import javax.swing.*;   //подключает библиотеку Swing, она встроена в язык Джава
import java.awt.*;      //для подключения контейнера и добавления кнопок, надписей.. (как винформс)

public class ContactForm extends JFrame {

    public ContactForm(){
        super("Контактная форма"); //заголовок
        super.setBounds(200,100,250, 200); //отступы
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //событие по закрытию формы

        Container container = super.getContentPane();   //создали контейнен
        container.setLayout(new GridLayout(3,2,2,2)); //указываем расположение
    }

}
