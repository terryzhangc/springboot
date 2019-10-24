package com.example.demo.controller;

import com.example.demo.dto.Greeting;
import com.example.demo.entity.City;
import com.example.demo.service.CustomerService;
import net.bytebuddy.build.ToStringPlugin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class HomeController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Resource
    private CustomerService customerService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/city")
    public List<City> getCities() {
        //test call servcie
        return customerService.getCities();
    }


}
