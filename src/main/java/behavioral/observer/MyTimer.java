package behavioral.observer;
//obserwuje -> OBSERWATOR
public class MyTimer implements InterfaceMyTimer {
    protected InputProvider subject;
    private boolean running;
    private Thread countingThread;

    void start() {
        if (running) { //domyslnie false, wiec przeskakuje dalej
            return;
        }

        countingThread = new Thread(() -> {
            running = true;
            int counter = 0;
            while (running) { //teraz true, wiec wchodzi do srodka
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(++counter);
            }
        });
        countingThread.start();
    }

    public void join() throws InterruptedException {
        countingThread.join();
    }

    public boolean isRunning() {
        return running;
    }

    @Override
    public void update() {
        running = false;
    }

    @Override
    public void exitRequested() {
        running = false;
    }
}