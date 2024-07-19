import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Test implements Runnable {
    public static CyclicBarrier barrier = new CyclicBarrier(3);
   String name;
    public Test(String number) {
        name = number;
    }

    public void run() {

            System.out.printf(name);

        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
