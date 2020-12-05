public class MultiThreads {

    private String letter = "A";

    public synchronized void  printA() {
            try {
                for (int i = 0; i < 3; i++) {
                    while (!letter.equals("A")) {
                        wait();
                    }
                    System.out.print("A");
                    letter = "B";
                    notifyAll();
                }
            } catch (Exception e) {
                throw new RuntimeException("SWW", e);
            }
    }

    public synchronized void  printB() {
        try {
            for (int i = 0; i < 3; i++) {
                while (!letter.equals("B")) {
                    wait();
                }
                System.out.print("B");
                letter = "C";
                notifyAll();
            }
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }

    public synchronized void  printC() {
        try {
            for (int i = 0; i < 3; i++) {
                while (!letter.equals("C")) {
                    wait();
                }
                System.out.print("C");
                letter = "A";
                notifyAll();
            }
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }
}



