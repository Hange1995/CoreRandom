package com.concurrency;

public class DownloadStatus {
    private int totalByte;

    public int getTotalByte() {
        return totalByte;
    }
    public void incrementByte(){
        totalByte++;
    }
}
