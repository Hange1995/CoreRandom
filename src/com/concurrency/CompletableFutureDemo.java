package com.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show(){
//        ForkJoinPool.commonPool();
        Supplier<Integer> task = ()-> 1;
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(task);
        try {
            Integer result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
