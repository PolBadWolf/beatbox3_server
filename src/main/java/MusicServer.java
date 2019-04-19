import java.io.*;
import java.net.Socket;
import java.util.*;

public class MusicServer {
    ArrayList<ObjectOutputStream> clientOutputStreams;

    public static void main(String[] args) {

    }
    public class ClientHandler implements Runnable {
        ObjectInputStream in;
        Socket clientSocket;

        public ClientHandler(Socket socket) {}

        @Override
        public void run() {

        }
    }

    public void go() {

    }
    public void tellEveryone(Object one, Object two) {

    }
}
