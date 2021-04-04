package com.sapient.connectsmart.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class Order {

	@Getter
	@Setter
	@JsonProperty("order_id")
	private String id;

	@Getter
	@Setter
	@JsonProperty("order_status")
	private String status;

	@Override
	public String toString() {
		return "Order::toString() { " + "order Id = '" + id + '\'' + ", orderStatus = " + status + " } ";
	}

}
