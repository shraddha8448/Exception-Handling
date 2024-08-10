// Try with Resources
import javax.print.DocPrintJob;
import java.io.*;
import java.net.SocketOption;

public class TryWithResource {
    public static void main(String[] args)throws IOException {
        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){  // AutoCloseable
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
