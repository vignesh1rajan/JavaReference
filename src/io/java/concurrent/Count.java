package io.java.concurrent;

public class Count {

   private static int count = 0;
   private static int bCount = 0;

    public static synchronized void incCounter() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " begin A count " + count);
        count++;
        Thread.sleep(100);

        System.out.println(Thread.currentThread().getName() + "End  A count " + count);

    }

    public static synchronized void incBCounter() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " begin B count " + bCount);
        bCount++;
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + " End B Count " + bCount);
    }
}
