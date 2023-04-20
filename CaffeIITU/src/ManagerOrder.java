import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerOrder extends Container {
    private JButton bt1;
    private JButton bt2;
    public static JTextArea lists;

    public ManagerOrder(){
        setSize(700, 600);
        setLayout(null);


        lists = new JTextArea();                   // area for lists of orders
        lists.setBounds(40, 100, 310, 300);
        add(lists);

        bt1 = new JButton("LIST ORDERS");
        bt1.setBounds(50, 30, 130, 30);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataOperation dt = new DataOperation("LIST");
                Main.con(dt);

            }
        });
        add(bt1);

        bt2 = new JButton("EXIT");
        bt2.setBounds(200, 30, 110, 30);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.welcWind.setVisible(true);
                Main.frame.managerOrd.setVisible(false);
            }
        });
        add(bt2);

    }

}
