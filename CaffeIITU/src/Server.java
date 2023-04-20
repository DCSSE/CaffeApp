import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(8888);

            while(true){
                System.out.println("Waiting...");
                Socket socket = server.accept();
                System.out.println("User connected");

                ServerThread svt = new ServerThread(socket);
                svt.start();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
