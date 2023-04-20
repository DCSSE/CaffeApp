import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main {

    public static MainFr frame;

    public static void con(DataOperation dt){
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if (dt.getOperType().equals("RESERVE")) {
                outputStream.writeObject(dt);       // reserving order
            } else if (dt.getOperType().equals("LIST")) {
                outputStream.writeObject(dt);
                DataOperation infoServ = (DataOperation)inputStream.readObject();
                ArrayList<Orders> arrayServ = infoServ.getOrders();
                String str = "";

                for (int i = 0; i < arrayServ.size(); i++) {
                    str += arrayServ.get(i) + "\n";
                }
                ManagerOrder.lists.append(str);
                System.out.println(ManagerOrder.lists);
            }


            inputStream.close();
            outputStream.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        frame = new MainFr();
        frame.setVisible(true);
    }
}
