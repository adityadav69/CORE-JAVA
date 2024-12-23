public class controlStatement {
    public static void main(String[] args) {
        /*
        condition control statements
        1-IF
        2-if else
        3-if else if ladder
        4-switch case

        Looping control statements
        1-for
        2-while
        3-do while loop
        */
        // int age=15;
        // int num=10;
        /*  if(age>18){
            System.out.println("You can drive");
        }
        */

        /* 
        if(age>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("Since you are under 18 you can't drive");
        }
        */
        /* 
        int marks=60;

        if(marks>=90){
            System.out.println("Grade A:");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Grade B:");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Grade C:");
        }
        else{
            System.out.println("You are just pass");
        }
        */


        //Looping control statements
        /* 
        for(int i=0;i<10;i++){
            System.out.println("Inside the loops"+ i);
        }
        */
        int i=0;
        /* 
        
        while(i<=num){
            System.out.println("Inside the while loops:"+i);
            i++;
        }
        */

        do{
            System.out.println("Inside the do while loop"+i);
            i++;
        }while(i!=20);


    }
}
