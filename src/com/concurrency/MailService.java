package com.concurrency;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public static void send(){
        LongTask.simulate();
        System.out.println("Mail was sent.");
    }
    public CompletableFuture<Void> sendAsync(){
        return CompletableFuture.runAsync(()-> send());
    }
}
