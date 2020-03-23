package com.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void  show() {
//       CompletableFuture<Integer> future =  CompletableFuture.supplyAsync(()->2);
//       future.thenAccept(a-> {
//           System.out.println(Thread.currentThread().getName());
//           System.out.println(a);
//
//       }  );
////        CompletableFuture<Object> future = CompletableFuture.supplyAsync(()-> {
////            System.out.println("get weather ");
////            throw new IllegalStateException();
////        });
////        try {
////            Object temperature = future.exceptionally(e->1).get();
////            System.out.println(temperature);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        } catch (ExecutionException e) {
////            e.printStackTrace();
////        }
////
//        。
////        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->20);
////        future.thenApply(CompletableFuturesDemo::toF)
////                .thenAccept(f-> System.out.println(f));
////         CompletableFuture.supplyAsync(()->"email")
////                  .thenCompose(email->CompletableFuture.supplyAsync(()->"playlist"))
////                .thenAccept(p-> System.out.println(p));
////    }
////    public static int toF (int ce){
////        return (int) ((ce*1.8)+32);
////    }
//        /
        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(()->{
            LongTask.simulate();
            return 20;
        });
        CompletableFuture<Integer> second = CompletableFuture.supplyAsync(()-> 30);
        CompletableFuture.anyOf(first,second).thenAccept(f-> System.out.println(f));

    }


}
