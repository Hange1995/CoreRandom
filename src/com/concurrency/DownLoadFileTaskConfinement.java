package com.concurrency;

public class DownLoadFileTaskConfinement implements Runnable {
    private DownloadStatus downloadStatus;

    public DownLoadFileTaskConfinement() {
        this.downloadStatus=new DownloadStatus();
    }

    public DownLoadFileTaskConfinement(DownloadStatus downloadStatus) {
        this.downloadStatus=new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Downloading a File Thread :" + Thread.currentThread().getName());
        for (int i = 0 ; i <10_000;i++){
            if (Thread.currentThread().isInterrupted())return;
            System.out.println(Thread.currentThread().getName());
            downloadStatus.incrementByte();
        }
        System.out.println("Download successfully!"+Thread.currentThread().getName());
    }

    public DownloadStatus getDownloadStatus() {
        return downloadStatus;
    }
}
