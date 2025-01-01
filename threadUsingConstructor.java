class Thread1 extends Thread{
    public void run(){
        int i=0;
        while (i!=100) {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
    Thread1(String name){
        super(name);
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        while (i!=100) {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
    Thread2(String name){
        super(name);
    }
}
public class threadUsingConstructor {
    public static void main(String[] args) {
        Thread1 t1=new Thread1("Aditya");
        Thread2 t2=new Thread2("Aditya yadav");
        System.out.println("Name of thread 1 is "+t1.getName());
        System.out.println("Name of thread 2 is "+t2.getName());
        // System.out.println("Name of thread 1 is "+t1.getId());
        // System.out.println("Name of thread 2 is "+t2.getId());

        t1.start();
    }
}
