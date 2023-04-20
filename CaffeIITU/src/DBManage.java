import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBManage {
    private Connection connection;
    public void connect() {
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ordersmanage",
                    "root", "Mik010718");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ReserveOrd(Orders order) {
        try {
            PreparedStatement stt = (PreparedStatement) connection
                    .prepareStatement("INSERT INTO orders (id, namecl, salad, soup, " +
                            "secmeal, sidedish, saladnum, soupnum, secmealnum, sidedishnum, " +
                            "pancnum, cheesenum, applepienum, croisnum, blininum, blackteanum, " +
                            "greenteanum, coffeenum, limonnum, cokenum, waternum, milknum) " + "VALUES (?,?,?,?," +
                            "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stt.setInt(1, order.getOrderid());
            stt.setString(2, order.getNameclient());
            stt.setString(3, order.getSalad());
            stt.setString(4, order.getSoup());
            stt.setString(5, order.getSecmeal());
            stt.setString(6, order.getSidedish());

            stt.setInt(7, order.getSaladnum());
            stt.setInt(8, order.getSoupnum());
            stt.setInt(9, order.getSecmealnum());
            stt.setInt(10, order.getSidedishnum());

            stt.setInt(11, order.getPancake());
            stt.setInt(12, order.getCheesecake());
            stt.setInt(13, order.getApplepie());
            stt.setInt(14, order.getCroissants());
            stt.setInt(15, order.getBliniwsyru());

            stt.setInt(16, order.getBlacktea());
            stt.setInt(17, order.getGreentea());
            stt.setInt(18, order.getCoffee());
            stt.setInt(19, order.getLimonade());
            stt.setInt(20, order.getCoke());
            stt.setInt(21, order.getWater());
            stt.setInt(22, order.getMilkshake());
            stt.executeUpdate();

            stt.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Orders> getallOrders (){
        ArrayList<Orders> orderList = new ArrayList<>();
        try {
            PreparedStatement st1 = (PreparedStatement) connection
                    .prepareStatement ("SELECT * FROM orders");
            ResultSet rs1 = st1.executeQuery();

            while (rs1.next()) {
                Integer id = rs1.getInt("id");
                String name = rs1.getString("namecl");
                String salad = rs1.getString("salad");
                Integer saladn = rs1.getInt("saladnum");
                String soup = rs1.getString("soup");
                Integer soupn = rs1.getInt("soupnum");
                String secmeal = rs1.getString("secmeal");
                Integer secmealn = rs1.getInt("secmealnum");
                String sidedish = rs1.getString("sidedish");
                Integer dishn = rs1.getInt("sidedishnum");

                Integer pancn = rs1.getInt("pancnum");
                Integer cheesen = rs1.getInt("cheesenum");
                Integer apppien = rs1.getInt("applepienum");
                Integer croisn = rs1.getInt("croisnum");
                Integer blinn = rs1.getInt("blininum");

                Integer bltean = rs1.getInt("blackteanum");
                Integer grtean = rs1.getInt("greenteanum");
                Integer coffeen = rs1.getInt("coffeenum");
                Integer limonn = rs1.getInt("limonnum");
                Integer coken = rs1.getInt("cokenum");
                Integer watern = rs1.getInt("waternum");
                Integer milksn = rs1.getInt("milknum");

                orderList.add(new Orders(salad, soup, secmeal, sidedish, saladn, soupn, secmealn, dishn, pancn,
                        cheesen, apppien, croisn, blinn, bltean, grtean, coffeen, limonn, coken, watern, milksn,
                        name, id));
            }
            st1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

}
