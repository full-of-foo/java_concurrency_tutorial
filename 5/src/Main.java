public class Main
{
    public static void main(String[] args)
    {
    	SynchronizedCounter c = new SynchronizedCounter();

        Thread inc = new IncThread(c);
        Thread dec = new DecThread(c);

        inc.start();
        dec.start();
    }
}