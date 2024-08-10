// IOException and throws keyword
// NumberFormatException
import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Start main");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String str = br.readLine();
        System.out.println(str);

        int data = 0;
        try{
            data = Integer.parseInt(br.readLine());
        }catch(NumberFormatException obj){
            System.out.println("Plz Enter Integer data");
            data = Integer.parseInt(br.readLine());
        }

        System.out.println(data);
        System.out.println("End Main");
    }
}
