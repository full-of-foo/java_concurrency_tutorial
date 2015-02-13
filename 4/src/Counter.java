public class Counter
{
    private int val;

    public Counter()
    {
        val = 0;
    }

    public void increment()
    {
        val = val + 1;
    }

    public void decrement()
    {
        val = val - 1;
    }

    public int getVal()
    {
        return val;
    }
}