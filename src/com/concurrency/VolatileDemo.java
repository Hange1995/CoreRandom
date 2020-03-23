package com.concurrency;

public class VolatileDemo {
    public static void show(){
        DownLoadStatusLock downLoadStatusLock = new DownLoadStatusLock();
        Thread thread1=new Thread(new DownLoadFileTaskLock(downLoadStatusLock));
        Thread thread2= new Thread(()->{
            while (!downLoadStatusLock.isDone()){}
            System.out.println(downLoadStatusLock.getTotalByte());
        });
        thread1.start();
        thread2.start();
    }
}
