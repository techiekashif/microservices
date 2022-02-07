package com.kashif.orderprocessingservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kashif.orderprocessingservice.model.OrderResponseVO;
import com.kashif.orderprocessingservice.model.OrderVO;
import com.kashif.orderprocessingservice.service.OrderProcessingService;

@RestController
public class OrderProcessingController {
	
	private OrderProcessingService orderProcessingService;
	
	public OrderProcessingController(OrderProcessingService orderProcessingService) {
		this.orderProcessingService = orderProcessingService;
	}
	
	@PostMapping("v1/order")
	public ResponseEntity<OrderResponseVO> createOrder(@RequestBody OrderVO orderVo){
		
		return ResponseEntity.ok(orderProcessingService.createOrder(orderVo));
	}

}
