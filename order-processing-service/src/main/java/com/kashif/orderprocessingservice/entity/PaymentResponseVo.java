package com.kashif.orderprocessingservice.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponseVo {

	private String orderId;
	private String paymentStatus;
	private String paymentReferenceNumber;
}
