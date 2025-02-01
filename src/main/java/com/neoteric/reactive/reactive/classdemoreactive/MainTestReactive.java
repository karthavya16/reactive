package com.neoteric.reactive.reactive.classdemoreactive;

import reactor.core.publisher.Mono;

public class MainTestReactive {
    public static void main(String[] args) throws InterruptedException {


        HelloWorldRcService helloWorldRcService=new HelloWorldRcService();
        long starttime=System.currentTimeMillis();
       String normalhello=helloWorldRcService.hello();

        String normalhyy=helloWorldRcService.hyy();

        long endtime=System.currentTimeMillis();
        System.out.println(normalhello);
        System.out.println(normalhyy);
        System.out.println((endtime-starttime)/1000);
        //main thraed will be blocked untill  get a resposes from  hyy and hello as well tatol blocked
        //  time of main thread  10sec=hyy is 10sec+hello is 5sec

        Mono<String> reactivehyy=helloWorldRcService.hyyReactive();

        reactivehyy.subscribe(data -> System.out.println(data),
                error -> System.out.println(error),
                () -> System.out.println("completed"));
        Mono<String> reactivehello=helloWorldRcService.helloReactive( );

        reactivehello.subscribe(data -> System.out.println(data),
                error -> System.out.println(error),
                () -> System.out.println("completed"));
        Thread.sleep(10000);
    }
}
