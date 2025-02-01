package com.neoteric.reactive.reactive.classdemoreactive;

import reactor.core.publisher.Mono;

import java.time.Duration;

public class HelloWorldRcService {

    public String hyy(){
        try{
            Thread.sleep(10*1000);
        }catch (Exception e){
            e.printStackTrace();

        }
        return "hyy";

    }

    public String hello(){
        try{
            Thread.sleep(5*1000);
        }catch (Exception e){
            e.printStackTrace();

        }
        return "hello";

    }

    public Mono<String> hyyReactive(){
        System.out.println(Thread.currentThread().getName());
        return Mono.just("reactivehyy").delayElement(Duration.ofSeconds(10));
    }

    public Mono<String> helloReactive(){
        System.out.println(Thread.currentThread().getName());
        return Mono.just("reactivehello").delayElement(Duration.ofSeconds(5));
    }
    public Mono<String> login(){
        return  Mono.just("lpgin").delayElement(Duration.ofSeconds(10));
    }
    public Mono<String> withdraw(){
        return  Mono.just("withdraw").delayElement(Duration.ofSeconds(5));
    }
}
