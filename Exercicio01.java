public class Exercicio01 extends Thread {

    public static void main(final String[] args) {
        int min = 3;
        int max = 10;

        for (int i = 0; i < 3; i++) {
            System.out.println("Executing Thread " + i);

            final Thread t = new Thread(() -> {
                String tName = Thread.currentThread().getName();
                System.out.println("Start Thread " + tName);
                
                try {
                    int time = (int)(Math.random() * (max - min + 1) + min);
                    Thread.currentThread();
                    Thread.sleep(time * 1000);
                    System.out.println("Stop Thread after 5s");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, ""+i);

            t.start();
        }

    }
}