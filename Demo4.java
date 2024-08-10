// throw keyword 
import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer value");
        int x = sc.nextInt();

        try{
            if(x==0){
                throw new ArithmeticException("Divide by zero");
            }

            System.out.println(10/x);
        }catch(ArithmeticException ae){
            System.out.print("Exception in thread " + Thread.currentThread().getName() + " ");
            ae.printStackTrace();
        }
    }
}
