package com;

import com.collections.Customer;
import com.collections.EmailCompartor;
import com.collections.MapDemo;
import com.collections.SetDemo;
import com.concurrency.*;
import com.designPattern.Car;
import com.designPattern.CarBuild;
import com.designPattern.CarFactory;
import com.designPattern.Singleton;
import com.lambda.LambdaDemo;
import com.lambda.Printer;
import com.streams.StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e2"));
        customers.add(new Customer("d", "e3"));
        customers.add(new Customer("c", "e1"));
//        Collections.sort(customers, new EmailCompartor());
        Comparator<Customer> emailComparator =(c1,c2)-> (c1.getEmail().compareTo(c2.getEmail()));
        System.out.println(customers);
//        StreamDemo.show();
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        MailService mailService= new MailService();
//        mailService.sendAsync();
//        System.out.println("hello");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//       StreamDemo.show();
        CarBuild carBuild=new CarBuild("BMW","M3");
        Car car = carBuild.setEngine(8).setColor("red").build();
    }
}
