package com.kashif.orderprocessingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
 public class OrderVO {
	
	private String orderID;
	
	private String orderStatus;
	
	private Double orderAmount;

}
