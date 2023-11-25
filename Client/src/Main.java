import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        try(Socket client = new Socket("127.0.0.1", 8000);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()))
        )
        {
            System.out.println("Connected");
            String request = "Yekaterinburg";
            writer.write(request);
            writer.newLine();
            writer.flush();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}