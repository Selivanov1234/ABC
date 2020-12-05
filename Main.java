public class Main {

    public static void main(String[] args) {

        MultiThreads multiThreads = new MultiThreads();

        new Thread(() -> multiThreads.printA()).start();
        new Thread(() -> multiThreads.printB()).start();
        new Thread(() -> multiThreads.printC()).start();

    }
}
