package io.java.concurrent;

public class Count {

   private static int count = 0;
   private static int bCount = 0;
   private int cCount = 0;

    public static synchronized void incCounter() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " begin A count " + count);
        count++;
        Thread.sleep(100);

        System.out.println(Thread.currentThread().getName() + "End  A count " + count);

    }

    public static synchronized void incBCounter() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " begin b count " + bCount);
        bCount++;
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + " End b Count " + bCount);
    }

    public synchronized void incCCounter() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " begin C count " + cCount);
        cCount++;
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + " End C Count " + cCount);
    }

}
