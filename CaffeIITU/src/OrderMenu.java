import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OrderMenu extends Container {
    private JLabel ordersLabel;
    private JLabel mealsLabel;
    private JLabel dessertsLabel;
    private JLabel drinksLabel;

    private JLabel saladLabel;
    private JLabel soupLabel;
    private JLabel secmealLabel;
    private JLabel sidedishLabel;

    private JLabel pancakeLabel;
    private JLabel cheesecakeLabel;
    private JLabel applepieLabel;
    private JLabel croissantsLabel;
    private JLabel bliniwsyruLabel;

    private JLabel blackteaLabel;
    private JLabel greenteaLabel;
    private JLabel coffeeLabel;
    private JLabel limonadeLabel;
    private JLabel cokeLabel;
    private JLabel waterLabel;
    private JLabel milkshakeLabel;

    private JLabel nameLabel;
    private JLabel IDLabel;

    private JTextField nameText;
    private JTextField IDText;

    private String[] salads= {"None", "Сaesar", "Leafy","Greek","Fattoush","Cobb"};
    private JComboBox saladBox;
    private JComboBox salad1Box;
    private String[] soups= {"None", "Ramen", "Pho","Bisque","Laksa","Tom yum"};
    private JComboBox soupBox;
    private JComboBox soup1Box;
    private String[] secmeals = {"None", "Steak", "Roast chicken","Omelet","Kebab","Fish"};
    private JComboBox secmealBox;
    private JComboBox secmeal1Box;
    private String[] sidedishes = {"None", "Smoothie", "Pasta","Rise","Buckwheat"};
    private JComboBox sidedishBox;
    private JComboBox sidedish1Box;
    private JButton addButton;
    private JButton backButton;
    private JComboBox pancakeBox;
    private JComboBox cheesecakeBox;
    private JComboBox applepieBox;
    private JComboBox croissantsBox;
    private JComboBox bliniwsyruBox;
    private JComboBox blackteaBox;
    private JComboBox greenteaBox;
    private JComboBox coffeeBox;
    private JComboBox limonadeBox;
    private JComboBox cokeBox;
    private JComboBox waterBox;
    private JComboBox milkshakeBox;

    public OrderMenu(){
        setSize(500, 500);
        setLayout(null);

        Integer []salad1 =  new Integer[10];
        for(int i=0;i<10;i++){
            salad1[i]=i;
        }

        Integer []soup1 =  new Integer[10];
        for(int i=0;i<10;i++){
            soup1[i]=i;
        }

        Integer []secmeal1 =  new Integer[10];
        for(int i=0;i<10;i++){
            secmeal1[i]=i;
        }

        Integer []sidedish1 =  new Integer[10];
        for(int i=0;i<10;i++){
            sidedish1[i]=i;
        }

        Integer []pancake =  new Integer[10];
        for(int i=0;i<10;i++){
            pancake[i]=i;
        }

        Integer []cheesecake =  new Integer[10];
        for(int i=0;i<10;i++){
            cheesecake[i]=i;
        }

        Integer []applepie =  new Integer[10];
        for(int i=0;i<10;i++){
            applepie[i]=i;
        }

        Integer []croissants =  new Integer[10];
        for(int i=0;i<10;i++){
            croissants[i]=i;
        }

        Integer []bliniwsyru =  new Integer[10];
        for(int i=0;i<10;i++){
            bliniwsyru[i]=i;
        }

        Integer []blacktea =  new Integer[10];
        for(int i=0;i<10;i++){
            blacktea[i]=i;
        }

        Integer []greentea =  new Integer[10];
        for(int i=0;i<10;i++){
            greentea[i]=i;
        }

        Integer []coffee =  new Integer[10];
        for(int i=0;i<10;i++){
            coffee[i]=i;
        }

        Integer []limonade =  new Integer[10];
        for(int i=0;i<10;i++){
            limonade[i]=i;
        }

        Integer []coke =  new Integer[10];
        for(int i=0;i<10;i++){
            coke[i]=i;
        }

        Integer []water =  new Integer[10];
        for(int i=0;i<10;i++){
            water[i]=i;
        }

        Integer []milkshake =  new Integer[10];
        for(int i=0;i<10;i++){
            milkshake[i]=i;
        }

        ordersLabel = new JLabel("  ORDERS  ");
        ordersLabel.setBounds(200, 10, 100, 30);
        add(ordersLabel);

        mealsLabel = new JLabel("MEALS");
        mealsLabel.setBounds(20, 50, 100, 30);
        add(mealsLabel);

        dessertsLabel= new JLabel("DESSERTS");
        dessertsLabel.setBounds(200, 50, 100, 30);
        add(dessertsLabel);

        drinksLabel= new JLabel("DRINKS");
        drinksLabel.setBounds(350, 50, 100, 30);
        add(drinksLabel);/////////////

        saladLabel = new JLabel("SALAD: ");
        saladLabel.setBounds(45, 100, 70, 20);
        add(saladLabel);

        saladBox = new JComboBox(salads);
        saladBox.setBounds(110, 100, 80, 20);
        add(saladBox);

        salad1Box = new JComboBox(salad1);
        salad1Box.setBounds(0, 100, 40, 20);//
        add(salad1Box);

        soupLabel = new JLabel("SOUP: ");
        soupLabel.setBounds(45, 150, 70, 20);
        add(soupLabel);

        soupBox = new JComboBox(soups);
        soupBox.setBounds(110, 150, 80, 20);
        add(soupBox);

        soup1Box = new JComboBox(soup1);
        soup1Box.setBounds(0, 150, 40, 20);//
        add(soup1Box);

        secmealLabel = new JLabel("2nd " +
                "MEAL: ");
        secmealLabel.setBounds(45, 200, 100, 20);
        add(secmealLabel);

        secmealBox = new JComboBox(secmeals);
        secmealBox.setBounds(110, 200, 80, 20);
        add(secmealBox);

        secmeal1Box = new JComboBox(secmeal1);
        secmeal1Box.setBounds(0, 200, 40, 20);//
        add(secmeal1Box);

        sidedishLabel = new JLabel("SIDE DISH: ");
        sidedishLabel.setBounds(45, 250, 70, 20);
        add(sidedishLabel);

        sidedishBox = new JComboBox(sidedishes);
        sidedishBox.setBounds(110, 250, 80, 20);
        add(sidedishBox);

        sidedish1Box = new JComboBox(sidedish1);
        sidedish1Box.setBounds(0, 250, 40, 20);//
        add(sidedish1Box);

        //pancakeLabel
        pancakeLabel = new JLabel("PANCAKE: ");
        pancakeLabel.setBounds(200, 100, 70, 20);
        add(pancakeLabel);

        pancakeBox = new JComboBox(pancake);
        pancakeBox.setBounds(290, 100, 50, 20);
        add(pancakeBox);

        //cheesecakeLabel
        cheesecakeLabel = new JLabel("CHEESECAKE:");
        cheesecakeLabel.setBounds(200, 150, 100, 20);
        add(cheesecakeLabel);

        cheesecakeBox = new JComboBox(cheesecake);
        cheesecakeBox.setBounds(290, 150, 50, 20);
        add(cheesecakeBox);

        //applepie
        applepieLabel = new JLabel("APPLE PIE: ");
        applepieLabel.setBounds(200, 200, 100, 20);
        add(applepieLabel);

        applepieBox = new JComboBox(applepie);
        applepieBox.setBounds(290, 200, 50, 20);
        add(applepieBox);

        //croissantsLabel
        croissantsLabel = new JLabel("CROISSANTS: ");
        croissantsLabel.setBounds(200, 250, 100, 20);
        add(croissantsLabel);

        croissantsBox = new JComboBox(croissants);
        croissantsBox.setBounds(290, 250, 50, 20);
        add(croissantsBox);

        //bliniwsyru
        bliniwsyruLabel = new JLabel("BLINY: ");
        bliniwsyruLabel.setBounds(200, 300, 70, 20);
        add(bliniwsyruLabel);

        bliniwsyruBox = new JComboBox(bliniwsyru);
        bliniwsyruBox.setBounds(290, 300, 50, 20);
        add(bliniwsyruBox);

        //blackteaLabel
        blackteaLabel = new JLabel("BLACK TEA: ");
        blackteaLabel.setBounds(350, 100, 100, 20);
        add(blackteaLabel);

        blackteaBox = new JComboBox(blacktea);
        blackteaBox.setBounds(430, 100, 50, 20);
        add(blackteaBox);

        //greentea
        greenteaLabel = new JLabel("GREEN TEA: ");
        greenteaLabel.setBounds(350, 150, 100, 20);
        add(greenteaLabel);

        greenteaBox = new JComboBox(greentea);
        greenteaBox.setBounds(430, 150, 50, 20);
        add(greenteaBox);

        //coffeLabel
        coffeeLabel = new JLabel("COFFEE: ");
        coffeeLabel.setBounds(350, 200, 100, 20);
        add(coffeeLabel);

        coffeeBox = new JComboBox(coffee);
        coffeeBox.setBounds(430, 200, 50, 20);
        add(coffeeBox);

        //limonadeLabel
        limonadeLabel = new JLabel("LEMONADE: ");
        limonadeLabel.setBounds(350, 250, 100, 20);
        add(limonadeLabel);

        limonadeBox = new JComboBox(limonade);
        limonadeBox.setBounds(430, 250, 50, 20);
        add(limonadeBox);

        //cokeLabel
        cokeLabel = new JLabel("COKE: ");
        cokeLabel.setBounds(350, 300, 100, 20);
        add(cokeLabel);

        cokeBox = new JComboBox(coke);
        cokeBox.setBounds(430, 300, 50, 20);
        add(cokeBox);

        //waterLabel
        waterLabel = new JLabel("WATER: ");
        waterLabel.setBounds(350, 350, 100, 20);
        add(waterLabel);

        waterBox = new JComboBox(water);
        waterBox.setBounds(430, 350, 50, 20);
        add(waterBox);

        //milkshakeLabel
        milkshakeLabel = new JLabel("MILKSHAKE: ");
        milkshakeLabel.setBounds(350, 400, 100, 20);
        add(milkshakeLabel);

        milkshakeBox = new JComboBox(milkshake);
        milkshakeBox.setBounds(430, 400, 50, 20);
        add(milkshakeBox);

        //NAME ID
        nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(30, 350, 70, 20);
        add(nameLabel);
        nameText = new JTextField();
        nameText.setBounds(100, 350, 200, 20);
        add(nameText);

        IDLabel = new JLabel("ID: ");
        IDLabel.setBounds(30, 400, 70, 20);
        add(IDLabel);
        IDText = new JTextField();
        IDText.setBounds(100, 400, 100, 20);
        add(IDText);


        addButton = new JButton("RESERVE");
        addButton.setBounds(50,450,100, 30);
        add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String salads = (String)saladBox.getSelectedItem();
                String soup = (String)soupBox.getSelectedItem();
                String secmeal = (String)secmealBox.getSelectedItem();
                String sidedish = (String)sidedishBox.getSelectedItem();

                Integer saladn = (Integer)salad1Box.getSelectedItem();
                Integer soupn = (Integer)soup1Box.getSelectedItem();
                Integer secmealn = (Integer)secmeal1Box.getSelectedItem();
                Integer sidedishn = (Integer)sidedish1Box.getSelectedItem();

                Integer pancn = (Integer)pancakeBox.getSelectedItem();
                Integer cheesen = (Integer)cheesecakeBox.getSelectedItem();
                Integer applepien = (Integer)applepieBox.getSelectedItem();
                Integer croisn = (Integer)croissantsBox.getSelectedItem();
                Integer blinin = (Integer)bliniwsyruBox.getSelectedItem();

                Integer blacktean = (Integer)blackteaBox.getSelectedItem();
                Integer greentean = (Integer)greenteaBox.getSelectedItem();
                Integer coffeen = (Integer)coffeeBox.getSelectedItem();
                Integer limonn = (Integer)limonadeBox.getSelectedItem();
                Integer coken = (Integer)cokeBox.getSelectedItem();
                Integer watern = (Integer)waterBox.getSelectedItem();
                Integer milkn = (Integer)milkshakeBox.getSelectedItem();

                String name = nameText.getText();
                Integer ID = Integer.parseInt(IDText.getText());
                Orders order = new Orders(salads, soup, secmeal, sidedish, saladn, soupn, secmealn,
                        sidedishn, pancn, cheesen, applepien, croisn, blinin, blacktean, greentean,
                        coffeen, limonn, coken, watern, milkn, name, ID);

                DataOperation dt = new DataOperation("RESERVE", order);
                Main.con(dt);

                nameText.setText("");//пустая строка
                IDText.setText("");//пустая строка

            }
        });

        backButton = new JButton("EXIT");
        backButton.setBounds(170,450,70,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.ordMenu.setVisible(false);
                Main.frame.welcWind.setVisible(true);
            }
        });
        add(backButton);
    }

}
