public class Main {
    public static void main(String[] args) {


        for(int i = 0; i < 10; i++){

            MultiThreadObject mto = new MultiThreadObject((i * 10), (i * 10) + 10);
            Thread myThread = new Thread(mto);
            myThread.start();

        }
    }
}