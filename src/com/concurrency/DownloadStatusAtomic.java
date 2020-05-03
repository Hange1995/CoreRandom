package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatusAtomic {
    private volatile boolean isDone;
    private AtomicInteger totalByte= new AtomicInteger();
//    private LongAdder totalByte= new LongAdder();
    private int totoalFile;


    public int getTotalByte() {
        return totalByte.get();
    }

    public void incrementByte(){
        totalByte.incrementAndGet();
    }

//    public int getTotoalFile() {
//        return totoalFile;
//    }
//
//    public boolean isDone() {
//        return isDone;
//    }
//    public void done () {
//        isDone = true;
//    }
//
//    public int getTotalByte() {
//        return totalByte.intValue();
//    }
//    public void incrementByte(){
//        totalByte.increment();
//    }
}
