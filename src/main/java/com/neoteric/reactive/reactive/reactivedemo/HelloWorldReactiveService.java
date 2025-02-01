package com.neoteric.reactive.reactive.reactivedemo;


import reactor.core.publisher.Mono;

public class HelloWorldReactiveService {
    public String sayHi(){
        return "hello world";
    }
    public Mono<String> sayHiReactive(int i){
        if(i==0){
            return  Mono.just("hello world");
        }else{
            return Mono.error(new RuntimeException());
        }

    }

}
