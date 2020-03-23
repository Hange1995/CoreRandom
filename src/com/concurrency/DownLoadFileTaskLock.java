package com.concurrency;

public class DownLoadFileTaskLock implements Runnable {
    private DownLoadStatusLock downloadStatus;

    public DownLoadFileTaskLock(DownLoadStatusLock downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    @Override
    public void run() {
        System.out.println("Downloading a File Thread :" + Thread.currentThread().getName());
        for (int i = 0 ; i <1_000_000;i++){
            if (Thread.currentThread().isInterrupted())return;
            downloadStatus.incrementByte();
        }
        downloadStatus.done();

        System.out.println("Download successfully!"+Thread.currentThread().getName());
    }

    public DownLoadStatusLock getDownloadStatus() {
        return downloadStatus;
    }
}
