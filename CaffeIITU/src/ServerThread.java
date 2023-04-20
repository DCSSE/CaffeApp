import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            DBManage manag = new DBManage();
            manag.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            DataOperation dtoper = null;
            while ( (dtoper = (DataOperation)inputStream.readObject()) != null) {
                if (dtoper.getOperType().equals("RESERVE")) {
                    Orders ordfromwaiter = dtoper.getOrder();
                    manag.ReserveOrd(ordfromwaiter);
                } else if (dtoper.getOperType().equals("LIST")) {
                    ArrayList<Orders> infoForManager = manag.getallOrders();
                    DataOperation toManager = new DataOperation(infoForManager);
                    outputStream.writeObject(toManager);
                }
            }

            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
