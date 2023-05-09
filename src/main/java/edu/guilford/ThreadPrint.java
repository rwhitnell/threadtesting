package edu.guilford;

import java.util.Random;

// The Runnable interface allows us to instantiate thread objects
public class ThreadPrint implements Runnable {
    // add some attributes to keep track of this thread
    private String name;
    private Random rand = new Random();
    // each thread will sleep between 1 and 6 seconds
    private int sleepTime = rand.nextInt(5000) + 1000;

    // constructor for name
    public ThreadPrint(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // run is what this thread will do when the driver program calls start()
        // this is where we put the code that we want to run in parallel
        System.out.println("Thread " + name + " is starting");

        System.out.println("Thread " + name + " is going to sleep for " + sleepTime + " milliseconds");
        try {
            // try to sleep, but we must deal with the interrupt exception
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " was interrupted");
            e.printStackTrace();
        }


        System.out.println("Thread " + name + " is done");

    }
    
}
