package com.iss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iss.entity.OrdersCustom;
import com.iss.mapper.OrdersCustomMapper;
import com.iss.mapper.UserMapper;
@Controller
@RequestMapping("/main")
/**
 * 
 * @author liu
 *
 */
public class UiController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private OrdersCustomMapper ordersCustomMapper;
	
	@RequestMapping("index")
	public void indexUi() {
		System.out.println("2222");
		System.out.println(userMapper.selectAll());
		
	}
	@RequestMapping("queryOrder")
	public OrdersCustom queryOrder() {
		List<OrdersCustom> orderCustom =  ordersCustomMapper.selectOrdersCustomMapper();
		System.out.println(orderCustom);
		System.out.println(orderCustom.size());
		return null;
		
		
		
	}
}
