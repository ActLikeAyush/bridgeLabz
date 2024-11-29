package Threads;

public class DestroyCPU {
    public static void main(String[] args) {


                // Creating 1000 threads to max out CPU usage
                for (int i = 0; i < 2000; i++) {


                    new Thread(() -> {
                        while (true) {

                            System.out.println("hy bro ............");

                        }
                    }).start();

                }


    }
}
