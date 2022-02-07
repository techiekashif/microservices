package com.kashif.orderprocessingservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document
@Builder
public class Order {

	private String orderId;
	private String orderStatus;
	private Double orderAmount;
	private String paymentReferenceNumber;
}
