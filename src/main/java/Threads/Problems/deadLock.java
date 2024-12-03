package Threads.Problems;

class Resource {
void method(String name) {

    System.out.println(name + " is executing...");
}
}
public class deadLock {
    public static void main(String[] args) {

        Resource resource1 = new Resource();
        Resource resource2 = new Resource();
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked resource 1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource2) {
                    resource2.method("Thread 1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 locked resource 2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource1) {
                    resource1.method("Thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}