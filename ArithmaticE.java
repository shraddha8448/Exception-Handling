// Arithmatic Exception

 public class ArithmaticE{
    public static void main(String[] args) {
        System.out.println("Start main");

        try{
            System.out.println(10/0);      // risky code
        }catch(ArithmeticException obj){
            System.out.println("Exception Occured"); //  Handling code
        }

        System.out.println("End main");
    }
}