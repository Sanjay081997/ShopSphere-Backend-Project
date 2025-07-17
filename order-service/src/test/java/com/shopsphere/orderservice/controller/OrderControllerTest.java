package com.shopsphere.orderservice.controller;

import com.shopsphere.orderservice.entity.Order;
import com.shopsphere.orderservice.service.OrderService;
import com.shopsphere.orderservice.controller.OrderController;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(OrderController.class)
public class OrderControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private OrderService orderService;

	@Test
	public void testGetOrderById() throws Exception {
		// Create mock Order entity to return
		Order mockOrder = new Order();
		mockOrder.setId(1L);
		mockOrder.setProduct("Sample Product");
		mockOrder.setQuantity(5);
		mockOrder.setPrice(100.0);

		// Stub service method
		Mockito.when(orderService.getOrderById(1L)).thenReturn(mockOrder);

		// Perf
	}
}