public class Main
{
    public static void main(String[] args)
    {
        Counter c = new Counter();

        Thread inc = new IncThread(c);
        Thread dec = new DecThread(c);

        inc.start();
        dec.start();
    }
}