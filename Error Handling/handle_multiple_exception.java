import java.util.Scanner;

public class handle_multiple_exception {
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=42;
        arr[1]=56;
        arr[2]=32;
        
    
        try{
         int index;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the index you want to divide the number from it");
        index=sc.nextInt();
        System.out.println("Enter the number which you want to divide");
        int n=sc.nextInt();
            int result=arr[index]/n;
            System.out.println("Result is "+result);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound! so please enter index less than 3");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurred please enter the number greater than 0");
        }
        catch(Exception e){
            System.out.println("Some other exception occured");
        }
    }
}
