class Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i != 100) {
            System.out.println("Thread1 is running");
            i++;
        }
        try {
            Thread.sleep(455);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i != 100) {
            System.out.println("Thread2 is running");
            i++;
        }
    }
}

public class someThreadMethod {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        try {
            t1.join();// t1 run untill it finish
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }

}