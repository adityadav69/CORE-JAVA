class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}
public class threadState {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }
}
