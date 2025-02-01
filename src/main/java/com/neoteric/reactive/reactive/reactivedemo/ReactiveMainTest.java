package com.neoteric.reactive.reactive.reactivedemo;

import reactor.core.publisher.Mono;

public class ReactiveMainTest {
    public static void main(String[] args) {
        HelloWorldReactiveService helloWorldReactiveService=new HelloWorldReactiveService();
      String normal=  helloWorldReactiveService.sayHi();
        System.out.println(normal);

       Mono<String> reactiveref=helloWorldReactiveService.sayHiReactive(0);
        System.out.println(reactiveref);
        reactiveref.subscribe(data -> System.out.println(data),
                error -> System.out.println(error),

                () -> System.out.println("on completed"));
        Mono<String> reactiveref1=helloWorldReactiveService.sayHiReactive(2);
        System.out.println(reactiveref1);
        reactiveref1.subscribe(data -> System.out.println(data),
                error -> System.out.println(error),

                () -> System.out.println("on completed"));
    }
    }



