public class Demo3 {
    
    void m1(){

    }

    void m2(){

    }
    public static void main(String[] args) {
        System.out.println("Start main");
        Demo3 obj = new Demo3();
        obj.m1();
        obj = null;

        try{
            obj.m2();
        }catch(NullPointerException obj2){          // NullPointerException
            System.out.println("In Catch Block");
        }finally{
            System.out.println("Connection Closed");
        }

        System.out.println("End main");
    }
}
