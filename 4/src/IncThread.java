public class IncThread extends Thread
{
    private static final int MAX = 1000;
    private Counter myCounter;

    public IncThread(Counter c)
    {
        myCounter = c;
    }   

    public void run()
    {
        for (int i = 0; i < MAX; i++)
        {
            myCounter.increment();
            System.out.println(myCounter.getVal());
        }
    }

}
