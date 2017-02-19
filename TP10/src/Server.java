import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void launch() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String s;
        while ((s = br.readLine()) != null){
            bw.write(s);
            bw.close();
        }
        socket.close();
        serverSocket.close();
    }

    public static void main(String[] args) throws IOException {
        launch();
    }

}
