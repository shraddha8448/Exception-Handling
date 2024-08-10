// User defined Exception 
import java.util.*;

class UnderAgeException extends Throwable{

    public UnderAgeException(String msg){
        super(msg);
    }
}
public class UDE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the Person");
        System.out.println("Note: Age must be greater than 18");

        int age = sc.nextInt();
        try{
            if(age < 18){
                throw new UnderAgeException("Not entry for teenage in pub");
            }else{
                System.out.println("Welcome in pub");
            }
        }catch(UnderAgeException ue){
            System.out.print("Exception in thread " + Thread.currentThread().getName() + " ");
            ue.printStackTrace();;
        }

    }
}
