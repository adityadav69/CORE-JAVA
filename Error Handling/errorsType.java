import java.util.Scanner;

public class errorsType{
    public static void main(String[] args) {
        //Syntax error
        // int a // syntax error semicolon missing

        //logical error

        //printing prime number
        // for(int i=1;i<5;i++){
        //     System.out.println(2*i+1); 
        // }

        //runtime error

        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("1000/a= "+1000/a); //for a=0 or a=char it will throw error
    }
}