package com.concurrency;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void  show (){
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            Future<Integer> future =  executor.submit(()->{
                LongTask.simulate();
                return 1;
            });
            System.out.println("Still running");
            try {
                Integer result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }finally {
            executor.shutdown();
        }

    }
}
