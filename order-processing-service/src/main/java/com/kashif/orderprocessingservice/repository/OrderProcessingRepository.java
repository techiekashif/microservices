package com.kashif.orderprocessingservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kashif.orderprocessingservice.entity.Order;

public interface OrderProcessingRepository extends MongoRepository<Order, String> {

}
