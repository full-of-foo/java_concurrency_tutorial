public class IncThread extends Thread
{
    private static final int MAX = 1000;
    private SynchronizedCounter myCounter;

    public IncThread(SynchronizedCounter c)
    {
        this.myCounter = c;
    }   

    public void run()
    {
        for (int i = 0; i < MAX; i++)
        {
            this.myCounter.increment();
            System.out.println(this.myCounter.getVal());
        }
    }

}
