package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownLoadStatusLock {

    private int totalByte;
    private Lock lock =new ReentrantLock();
    public int getTotalByte() {
        return totalByte;
    }
    public void incrementByte(){
        lock.lock();
        try{
            totalByte++;
        }finally {
            lock.unlock();
        }
    }
}
