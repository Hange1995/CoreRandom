package com.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AtomicDemo {
    public static void show(){
    DownloadStatusAtomic downloadStatus= new DownloadStatusAtomic();
    List<Thread> threads=new ArrayList<>();
        for (int i =0;i<10;i++){
        Thread thread = new Thread(new DownLoadFileTashAtomic(downloadStatus));
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
        System.out.println(downloadStatus.getTotalByte());


}
}
