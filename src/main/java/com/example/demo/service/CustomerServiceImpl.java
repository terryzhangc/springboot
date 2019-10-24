package com.example.demo.service;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService {
    @Resource
    private CityRepository cityRepository;

    @Override
    public List<City> getCities(){
        List<City> list = cityRepository.findAll();
        return list;
    }
}
