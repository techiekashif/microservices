package com.kashif.orderprocessingservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kashif.orderprocessingservice.entity.PaymentResponseVo;

@FeignClient(name = "payment-client", url = "${payment-service-url}")
public interface PaymentClient {
	
	@GetMapping("v1/payment/status")
	public PaymentResponseVo getPaymentStatus(@RequestParam String orderId);
		
		

	
}
