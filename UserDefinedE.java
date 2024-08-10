import java.util.Scanner;

class DataUnderflowException extends RuntimeException{
    DataUnderflowException(String msg){
        super(msg);
    }
}

class DataOverflowExceptoin extends RuntimeException{
    DataOverflowExceptoin(String msg){
        super(msg);
    }
}
public class UserDefinedE {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer VAlue");
        System.out.println("Note : 0 < Element < 100");

        for(int i=0; i<arr.length; i++){
            int data = sc.nextInt();

            if(data < 0){
                throw new DataUnderflowException("Value is less than Zero");
            }

            if(data > 100){
                throw new DataOverflowExceptoin("Value is greater than 100");
            }

            arr[i] = data;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}
