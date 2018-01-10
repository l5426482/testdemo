package com.iss.entity;

import java.util.List;

public class OrdersCustom extends Orders{
	User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "OrdersCustom ["+super.toString()+"user=" + user + "]";
	}
	

}
