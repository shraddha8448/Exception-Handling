// Exception Handling

import java.io.*;

public class Demo {

    void gun()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("In gun()");
        String str = br.readLine();
    }

    void fun()throws IOException{
        System.out.println("In fun()");
        gun();
    }
    public static void main(String[] args)throws IOException {
        System.out.println("Start main");

        Demo obj = new Demo();
        obj.fun();
        System.out.println("End Main");
    }
}
