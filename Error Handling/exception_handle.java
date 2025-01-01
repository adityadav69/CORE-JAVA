import java.util.Scanner;

public class exception_handle {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        a=100;
        try{
            b=sc.nextInt();
            int c=a/b;
            System.out.println("Result is "+c);
        }catch(Exception e){
            System.out.println("Error aa gaya hai "+e);
        }

        System.out.println("end of program...");

    }
}
