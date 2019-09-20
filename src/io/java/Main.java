package io.java;

import io.java.concurrent.Count;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable t1 = () -> {
            try {
                Count.incBCounter();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable t2 = () -> {
            try {
                Count.incCounter();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Count c = new Count();
        Runnable t3 = () -> {
            try {
                c.incCCounter();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        ExecutorService service = Executors.newFixedThreadPool(2);
        System.out.println(" starting thread ...");
        service.submit(t1);
        service.submit(t3);
        service.submit(t2);
        service.submit(t2);
        service.submit(t3);
        service.submit(t3);
        service.shutdown();

    }
}
