class Thread1 extends Thread{
    Thread1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i!=300) {
        System.out.println("Thread is running with name "+this.getName());
        i++;
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        Thread1 t1=new Thread1("Thread1");
        Thread1 t2=new Thread1("Thread2");
        Thread1 t3=new Thread1("Thread3");
        Thread1 t4=new Thread1("Thread4");
        Thread1 t5=new Thread1("Thread5");
        Thread1 t6=new Thread1("Thread6 most important");
        t6.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
