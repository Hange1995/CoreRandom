package com.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ConfinementDemo {
    public static void show(){
        DownloadStatus downloadStatus= new DownloadStatus();
        List<Thread> threads=new ArrayList<>();
        List<DownLoadFileTaskConfinement> tasks = new ArrayList<>();
        for (int i =0;i<10;i++){
            DownLoadFileTaskConfinement task = new DownLoadFileTaskConfinement();
            tasks.add(task);
            Thread thread = new Thread(task);
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
        Optional<Integer> totalBytes = tasks.stream().map(t->t.getDownloadStatus().getTotalByte())
                .reduce( Integer::sum);
        System.out.println(totalBytes);


    }
}
