package threads;
public class TestThread implements Runnable{
    int max;
    TestThread(int max){
        this.max = max;
    }

    public void run(){
        try {
            int x = 0;
            for (int i = 0; i < max; i++) {
                x += 1;
                System.out.println("x value: " + x);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}