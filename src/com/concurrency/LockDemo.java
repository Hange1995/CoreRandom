package com.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LockDemo {
    public static void show(){
    DownLoadStatusLock downloadStatus= new DownLoadStatusLock();
    List<Thread> threads=new ArrayList<>();
        for (int i =0;i<10;i++){
        Thread thread = new Thread(new DownLoadFileTaskLock(downloadStatus));
        thread.start();
        threads.add(thread);
    }
        for (Thread thread:threads){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    Optional<Integer> totalBytes = tasks.stream().map(t->t.getDownloadStatus().getTotalByte())
//            .reduce( Integer::sum);
        System.out.println(downloadStatus.getTotalByte());


}
}
