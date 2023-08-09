package com.onetomany.onetomany.controller;

import com.onetomany.onetomany.entity.Customer;
import com.onetomany.onetomany.entity.Product;
import com.onetomany.onetomany.repository.CustomerRepository;
import com.onetomany.onetomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {

    private final RestTemplate restTemplate;
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getProducts")
    public ResponseEntity<List<Product>> getProducts(){

        List<Product> products = productRepository.findAll();

        return ResponseEntity.ok().body(products);
    }
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody Customer customer){

        return customerRepository.save(customer);
    }

    @GetMapping("findAllOrders")
    public List<Customer> getAll(){
        return  customerRepository.findAll();
    }

    @GetMapping("get_rest")
    public ResponseEntity<?> getRest(){

        List<Customer> rest= restTemplate.getForObject("http://localhost:8080/findAllOrders",List.class);
        return ResponseEntity.ok().body(rest);
    }
}
