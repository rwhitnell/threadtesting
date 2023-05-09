package edu.guilford;


public class ThreadTesting 
{
    public static void main( String[] args )
    {
      // We build some Thread objects using the ThreadPrint class
      Thread thread1 = new Thread(new ThreadPrint("1"));
      Thread thread2 = new Thread(new ThreadPrint("2"));
      Thread thread3 = new Thread(new ThreadPrint("3"));
      Thread thread4 = new Thread(new ThreadPrint("4"));
      Thread thread5 = new Thread(new ThreadPrint("5"));
      Thread thread6 = new Thread(new ThreadPrint("6"));

        // We start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        // Let's interrupt thread 3
        thread3.interrupt();
    }
}
