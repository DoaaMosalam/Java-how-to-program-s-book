package example;

public class garbagecollection {

    public garbagecollection() {
        System.out.println("constructing");
    }
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                while (true) {
                    System.out.println(Runtime.getRuntime().totalMemory() / (1024.0f * 1024.0f) +"MB");
                }
            }
        }.start();
        while(true){
            new garbagecollection();
        }
    }
    @Override protected void finalize() throws Throwable {
        System.out.println("finalizing");
    }

}
