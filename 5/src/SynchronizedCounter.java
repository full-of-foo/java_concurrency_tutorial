public class SynchronizedCounter
{
    private int val;

    public SynchronizedCounter()
    {
        val = 0;
    }

    public synchronized void increment()
    {
        val = val + 1;
    }

    public synchronized void decrement()
    {
        val = val - 1;
    }

    public synchronized int getVal()
    {
        return val;
    }
}