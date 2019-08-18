package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CompletableFutureExamples {

    public static void main(String[] args){

        try {
            Example3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void Example3() throws InterruptedException {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            return s.toUpperCase();
        });
        System.out.println("MESSAGE "+ cf.getNow(null));
    }

    public static void Example2() throws InterruptedException {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            return s.toUpperCase();
        });
        System.out.println("MESSAGE "+ cf.getNow(null));
    }

    public static void Example1() throws InterruptedException {
        CompletableFuture<Void> cf = CompletableFuture .runAsync(() -> {
            System.out.println(Thread.currentThread().isDaemon());
        });
        while (!cf.isDone()){
            Thread.sleep(1000);
        }
    }
}
