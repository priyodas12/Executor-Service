package io.multithreading.ReentrantLockImpl;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Display {

    ReentrantLock lock=new ReentrantLock();


    public void showMessage(String name){
        lock.lock();
        IntStream.range(0,10).forEach(i -> {
            System.out.println(""+new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+" from "+Thread.currentThread().getName());
        });
        lock.unlock();
    }
}
