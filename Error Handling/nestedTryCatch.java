import java.util.InputMismatchException;
import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=42;
        arr[1]=56;
        arr[2]=32;
        Scanner sc =new Scanner(System.in);


        boolean flag=true;
        while (flag) {
            try{
                System.out.println("Enter the value of index");
                int index=sc.nextInt();
                try{
                    System.out.println("Enter the Number");
                    int num=sc.nextInt();
    
                    System.out.println("divided succesfully with value "+arr[index]/num);
                    flag=false;
                }catch(ArithmeticException e){
                    System.out.println("Please enter value greater than 0");
                }catch(InputMismatchException e){
                    System.out.println("Please enter number in num");
                }
    
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Enter the index less than 3");
            }
            catch(InputMismatchException e){
                System.out.println("index can not be string");
            }
        }
      
    }
}
