import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class WelcomeWind extends Container {
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb;
    private JTextField txt1;
    private JPasswordField jpas1;
    private JButton bt1;

    public WelcomeWind() {

        lb1 = new JLabel("CAFFE IITU");
        lb1.setBounds(125, 30, 70, 40);
        lb1.setForeground(Color.BLUE);
        add(lb1);

        lb = new JLabel();
        lb.setBounds(110, 60, 150, 20);
        lb.setForeground(Color.RED);
        add(lb);

        lb2 = new JLabel("Username:");
        lb2.setBounds(70, 80, 90, 20);
        lb2.setForeground(Color.YELLOW);
        add(lb2);
        txt1 = new JTextField();
        txt1.setBounds(150, 80, 140, 20);
        add(txt1);

        lb3 = new JLabel("Password:");
        lb3.setBounds(70, 130, 70, 20);
        lb3.setForeground(Color.YELLOW);
        add(lb3);
        jpas1 = new JPasswordField();
        jpas1.setBounds(150, 130, 140, 20);
        add(jpas1);

        bt1 = new JButton("Log in");
        bt1.setBounds(90, 200, 190, 25);
        add(bt1);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String userName = txt1.getText();
                String passw = jpas1.getText();

                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ordersmanage",
                            "root", "Mik010718");

                    PreparedStatement st1 = (PreparedStatement) connection
                                .prepareStatement("Select username, password from users where id=1");

                    ResultSet resultSet = st1.executeQuery();
                    if (resultSet.next()) {
                        String name = resultSet.getString("username");
                        String pass = resultSet.getString("password");
                        if (userName.equals(name) && passw.equals(pass) ) {
                            Main.frame.managerOrd.setVisible(true);
                            Main.frame.welcWind.setVisible(false);
                        }
                        else {
                            txt1.setText("");
                            jpas1.setText("");
                            lb.setText("Wrong Username & Password");
                        }
                    }

                    PreparedStatement st2 = (PreparedStatement) connection.prepareStatement("Select username, password from users where id=2");
                    ResultSet rs2 = st2.executeQuery();
                    if (rs2.next()) {
                        String name2 = rs2.getString("username");
                        String pass2 = rs2.getString("password");
                        if (userName.equals(name2) && passw.equals(pass2)) {
                            Main.frame.ordMenu.setVisible(true);
                            Main.frame.welcWind.setVisible(false);
                        }
                        else {
                            txt1.setText("");
                            jpas1.setText("");
                            lb.setText("Wrong Username & Password");
                        }
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });

        setSize(500, 400);
        setLayout(null);
        ImageIcon background = new ImageIcon("D:\\Almira\\Pictures\\Caffe1.jpeg");
        Image img = background.getImage();
        Image temp = img.getScaledInstance(500,500,Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        JLabel back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,500,500);
        add(back);

    }
}
