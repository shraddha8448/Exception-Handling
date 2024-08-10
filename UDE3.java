class m1Exception extends Throwable{

}

public class UDE3 {

    public static void main(String[] args) {
        
        try{
            throw new m1Exception();
        }catch(m1Exception obj){

        }
        
    }
}
