package com.streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
        List<Movie>movies= com.sun.tools.javac.util.List.of(new Movie("a",10),
                                    new Movie("b",15),
                                    new Movie("c",20));


//        movies.stream()
//                .map(movie -> movie.getLikes())
//                .distinct()
//                .forEach(System.out::println);

        movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .peek(movie -> System.out.println("filtered "+ movie.getTitle()))
                .map(Movie::getTitle)
                .peek(t-> System.out.println("mapped "+t))
                .forEach(System.out::println);

        //imperative  programing : how things do
//        int count = 0;
//        for (Movie movie : movies)
//            if (movie.getLikes()>10)
//                count++;
//        // declarative programing: what to do
//        long count2 = movies.stream().filter(movie -> movie.getLikes()>10).count();
//        System.out.println(count);
//        System.out.println(count2);
//        movies.stream()
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));
//
//        Stream<com.sun.tools.javac.util.List<Integer>> stream =  Stream.of(com.sun.tools.javac.util.List.of(1,2,3), com.sun.tools.javac.util.List.of(4,5,6));
//        stream
//                .flatMap(list->list.stream())
//                .forEach(n-> System.out.println(n));


    }
}
