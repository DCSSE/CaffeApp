import javax.swing.*;
import java.awt.*;

public class MainFr extends JFrame {
    public static WelcomeWind welcWind;
    public static OrderMenu ordMenu;
    public static ManagerOrder managerOrd;

    public MainFr() {
        setSize (400,400);
        setTitle ("CAFFE IITU APP");
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // программа останавливается при закрытие окна

        welcWind = new WelcomeWind();
        setLocation(0, 0);
        welcWind.setVisible(true);
        add(welcWind);

        ordMenu = new OrderMenu();
        setLocation(0, 0);
        ordMenu.setVisible(false);
        add(ordMenu);

        managerOrd = new ManagerOrder();
        setLocation(0, 0);
        managerOrd.setVisible(false);
        add(managerOrd);


    }

}
