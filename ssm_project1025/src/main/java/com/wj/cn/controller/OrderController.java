
    /**  
    * @Title: OrderController.java
    * @Package com.wj.cn.controller
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author Mashiroins
    * @date 2019��10��12������3:43:43
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
    * @Description: TODO(������һ�仰��������������)
    * @author Mashiroins
    * @date 2019��10��12������3:43:43
    * @version:1.0
    */
@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;//��ҵ������ͨ��@Autowiredע��ע�뵽��������
	@Autowired
	private DoorService doorservice;
	
	
	//��ѯ���еĶ������ݣ�Ȼ����ʾ���б�ҳ��
	@GetMapping("/orderList")
	public String findAllOrder(HttpServletRequest req) {
		//����ҵ��㷽��
		List<Order> list = orderService.findOrders();
		//�����ݰ󶨵������б�ҳ��
		req.setAttribute("orderList", list);
		return "orderList";
		
		
	}
	
	@RequestMapping("/orderAdd")
	public String toAddOrder(Model model) {
		
		//׼�����ݣ������ŵ꣩
				List<Door> list = doorservice.findAllDoorInfo();
				model.addAttribute("doorList", list);

		return "orderAdd";
		
	}
	
	//����һ��������¼��Ȼ����ʾ���б�ҳ��
	@RequestMapping("/addOrder")
	public String addOrder(Order order) {
		//����ҵ��㷽��
		orderService.addOrders(order);
		
		return "redirect:orderList";
	}
	
	
	//��ѯһ������
	@RequestMapping("/findOneOrder")
	@ResponseBody
	public Order findOneOrder(Integer id) {
		return orderService.SelectOneOrder(id);
	}
	
	//�޸Ķ���
	@RequestMapping("/toUpdateOrder")
	public String toUpdateOrder(Integer id,Model model) {
		//��ѯ�������ݸ�ҳ��׼������
		Order order = orderService.SelectOneOrder(id);
		model.addAttribute("order", order);
		
		//��ѯ�ŵ����ݸ�ҳ��׼������������
		List<Door> list = doorservice.findAllDoorInfo();
		model.addAttribute("doorList", list);
		
		//��ת���޸�ҳ��
		return "orderUpdate";	
	}
	@RequestMapping("/update")
	public String UpdateOrder(Order order) {
		
		orderService.update(order);
		
		return "redirect:orderList";
	}
	
	//ɾ������
	@RequestMapping("/delete")
	public String DeleteOrder(Integer id) {
		
		orderService.delete(id);
		
		return "redirect:orderList";
	}
	

}
