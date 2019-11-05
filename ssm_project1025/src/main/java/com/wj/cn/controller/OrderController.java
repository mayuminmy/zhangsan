
    /**  
    * @Title: OrderController.java
    * @Package com.wj.cn.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author Mashiroins
    * @date 2019年10月12日下午3:43:43
    * @version V1.0  
    */
    
package com.wj.cn.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wj.cn.pojo.Door;
import com.wj.cn.pojo.Order;
import com.wj.cn.service.DoorService;
import com.wj.cn.service.OrderService;

/**
    * @ClassName: OrderController
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Mashiroins
    * @date 2019年10月12日下午3:43:43
    * @version:1.0
    */
@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;//将业务层对象通过@Autowired注解注入到控制器层
	@Autowired
	private DoorService doorservice;
	
	
	//查询所有的订单数据，然后显示到列表页面
	@GetMapping("/orderList")
	public String findAllOrder(HttpServletRequest req) {
		//调用业务层方法
		List<Order> list = orderService.findOrders();
		//将数据绑定到订单列表页面
		req.setAttribute("orderList", list);
		return "orderList";
		
		
	}
	
	@RequestMapping("/orderAdd")
	public String toAddOrder(Model model) {
		
		//准备数据（所有门店）
				List<Door> list = doorservice.findAllDoorInfo();
				model.addAttribute("doorList", list);

		return "orderAdd";
		
	}
	
	//新增一条订单记录，然后显示到列表页面
	@RequestMapping("/addOrder")
	public String addOrder(Order order) {
		//调用业务层方法
		orderService.addOrders(order);
		
		return "redirect:orderList";
	}
	
	
	//查询一个订单
	@RequestMapping("/findOneOrder")
	@ResponseBody
	public Order findOneOrder(Integer id) {
		return orderService.SelectOneOrder(id);
	}
	
	//修改订单
	@RequestMapping("/toUpdateOrder")
	public String toUpdateOrder(Integer id,Model model) {
		//查询订单数据给页面准备数据
		Order order = orderService.SelectOneOrder(id);
		model.addAttribute("order", order);
		
		//查询门店数据给页面准备下拉框数据
		List<Door> list = doorservice.findAllDoorInfo();
		model.addAttribute("doorList", list);
		
		//跳转到修改页面
		return "orderUpdate";	
	}
	@RequestMapping("/update")
	public String UpdateOrder(Order order) {
		
		orderService.update(order);
		
		return "redirect:orderList";
	}
	
	//删除订单
	@RequestMapping("/delete")
	public String DeleteOrder(Integer id) {
		
		orderService.delete(id);
		
		return "redirect:orderList";
	}
	

}
