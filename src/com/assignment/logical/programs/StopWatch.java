package com.assignment.logical.programs;

public class StopWatch {
    public static void main(String[] args) throws Exception {

        System.out.println("Press Enter to start stopwatch : ");
        System.in.read();

        int seconds=0;
        while(System.in.available()==0)     // While ( input is empty )
        {
            System.out.println(seconds);    // print second
            Thread.sleep(1000);        // sleep for 1 second
            seconds++;                      // increase second
        }
        // User pressed the 'Enter'
        System.out.println("Stopwatch stopped at " + seconds + " seconds" );
    }
}
