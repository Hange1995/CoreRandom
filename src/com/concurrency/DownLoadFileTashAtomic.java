package com.concurrency;

public class DownLoadFileTashAtomic implements Runnable{
    private DownloadStatusAtomic downloadStatus;

    public DownLoadFileTashAtomic(DownloadStatusAtomic downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    @Override
    public void run() {
        System.out.println("Downloading a File Thread :" + Thread.currentThread().getName());
        for (int i = 0 ; i <1_000_000;i++){
            if (Thread.currentThread().isInterrupted())return;
            downloadStatus.incrementByte();
        }
        System.out.println("Download successfully!"+Thread.currentThread().getName());
    }

    public DownloadStatusAtomic getDownloadStatus() {
        return downloadStatus;
    }
}
