package com.neoteric.reactive.reactive.monoflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test/users")
public class WebClientTestController {

    private final CustomerWebClientService customerWebClientService;

    public WebClientTestController(CustomerWebClientService customerWebClientService) {
        this.customerWebClientService = customerWebClientService;


    }
    @GetMapping
    public Flux<User> getAllCustomers() {
        return customerWebClientService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Mono<User> getCustomerById(@PathVariable Long id) {
        return customerWebClientService.getUserById(id);
    }
}
