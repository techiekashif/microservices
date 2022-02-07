package com.kashif.orderprocessingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kashif.orderprocessingservice.entity.Order;
import com.kashif.orderprocessingservice.model.OrderResponseVO;
import com.kashif.orderprocessingservice.model.OrderVO;
import com.kashif.orderprocessingservice.repository.OrderProcessingRepository;

@Service
public class OrderProcessingService {
	
	@Autowired
	private OrderProcessingRepository orderProcessingRepository;

	public OrderResponseVO createOrder(OrderVO orderVO) {
		orderProcessingRepository.save(Order
				.builder()
				.orderId(orderVO.getOrderID())
				.orderAmount(orderVO.getOrderAmount())
				.build());
		
		return OrderResponseVO.builder()
				.orderId(orderVO.getOrderID())
				.build();
		
	}
	
}

