package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownLoadStatusLock {
    private volatile boolean isDone;
    private int totalByte;
    private int totoalFile;
    private Object totalByteLock = new Object();
    private Object totalFileLock = new Object();


    public int getTotalByte() {
        return totalByte;
    }
    public void incrementByte(){
        synchronized (totalByteLock){
            totalByte++;
        }
    }
    public void incrementFile(){
        synchronized ( totalFileLock ){
            totoalFile++;
        }
    }

    public int getTotoalFile() {
        return totoalFile;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done () {
        isDone = true;
    }
}
