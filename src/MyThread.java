import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {
    private List<Integer> fibonachi;
    private int count;

    public MyThread(int count) {
        this.count = count;
        this.fibonachi = new ArrayList<>();
        this.fibonachi.add(1);
        this.fibonachi.add(1);
    }

    @Override
    public void run() {
        for (int i = 0; i <= count-1; i++) {
            if (fibonachi.size() <= i) {
                fibonachi.add(fibonachi.get(i-1) + fibonachi.get(i-2));
            }
            System.out.print(" " + fibonachi.get(i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
