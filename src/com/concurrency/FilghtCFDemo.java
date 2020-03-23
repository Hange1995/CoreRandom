package com.concurrency;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class FilghtCFDemo {
    public static LocalTime start  = LocalTime.now();
    public static void show(){
        FlightService flightService = new FlightService();
        List<CompletableFuture<Void>> futures = flightService.getQuotes().map(future->future.thenAccept(quote -> System.out.println(quote)))
                .collect(Collectors.toList());
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(()->{
                LocalTime end = LocalTime.now();
                Duration duration = Duration.between(start,end);
                    System.out.println("finally time ="+duration.toMillis());
                });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
