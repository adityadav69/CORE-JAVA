
//Thread using extends thread class

// class Thread1 extends Thread {
//     @Override
//     public void run() {
//         int i = 0;
//         while (i < 200) {
//             System.out.println("Thread 1 is running");
//             i++;
//         }
//     }
// }
// class Thread2 extends Thread {
//     @Override
//     public void run() {
//         int i = 0;
//         while (i < 200) {
//             System.out.println("Thread 2 is running");
//             i++;
//         }
//     }
// }


//Thread using runnable interface

class Thread1 implements Runnable{
    public void run(){
        int i=0;
        while(i!=1000){
            System.out.println("I am in thread 1");
            i++;
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        int i=0;
        while(i!=1000){
            System.out.println("I am in thread 2");
            i++;
        }
    }
}


public class threading_2types_creation {
    public static void main(String[] args) {
        //For extending thread class we have to create only object of our class and run start() method directly
        // Thread1 t1=new Thread1();
        // Thread2 t2=new Thread2();
        // t1.start();
        // t2.start();

        //For Runnable interface we have to create a object of thread class of your object
        Thread1 t1 =new Thread1();
        Thread t1o=new Thread(t1);
        Thread2 t2 =new Thread2();
        Thread t2o=new Thread(t2);
        t1o.start();
        t2o.start();
       
    }
}
