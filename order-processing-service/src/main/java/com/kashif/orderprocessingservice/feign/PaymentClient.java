package com.kashif.orderprocessingservice.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "payment-client", url = "${payment-service-url}")
public interface PaymentClient {

	
}
