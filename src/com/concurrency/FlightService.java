package com.concurrency;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightService  {
    public Stream<CompletableFuture<Quote>> getQuotes (){
        com.sun.tools.javac.util.List<String> sites = com.sun.tools.javac.util.List.of("site1","site2","site3");
       return sites.stream().map(site->getQuote(site));
    }
    public CompletableFuture<Quote> getQuote (String site){
        return CompletableFuture.supplyAsync(()->{
            Random random = new Random();
            LongTask.simulate(1000+random.nextInt(2000));
            int price = 100+ random.nextInt(100 );
            return new Quote(site,price);
        });
    }
}
