public class MultiThreadObject implements Runnable {

    private int startValue = 0;
    private int endValue = 0;
    public MultiThreadObject(int startValue, int endValue){
        this.startValue = startValue;
        this.endValue = endValue;
    }
    @Override
    public void run() {
        for(int i = startValue; i < endValue; i++){
            System.out.println(i + 1 + "   -> Thread " + ((startValue/10) + 1));
        }
    }
}
