package hw121;

public class ThreadStart extends Thread {

    public static void main(String[] args) {

        Seconds seconds = new Seconds();

        Thread thread = new Thread(new Message(seconds));
        Thread thread5 = new Thread(new Message5(seconds));

        thread.start();
        thread5.start();

    }
}


