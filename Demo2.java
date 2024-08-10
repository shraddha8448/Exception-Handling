
// finally Block in Exception Handling

public class Demo2 {

    void m1(){

    }

    void m2(){

    }
    public static void main(String[] args) {
        System.out.println("Start main");
        Demo2 obj = new Demo2();
        obj.m1();
        obj = null;

        try{
            obj.m2();
        }catch(ArithmeticException obj2){          // NullPointerException
            System.out.println("In Catch Block");
        }finally{
            System.out.println("Connection Closed");
        }

        System.out.println("End main");
    }
}
