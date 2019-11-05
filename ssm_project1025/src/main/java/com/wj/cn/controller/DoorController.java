
    /**  
    * @Title: DoorController.java
    * @Package com.wj.cn.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author Mashiroins
    * @date 2019年10月11日下午2:18:49
    * @version V1.0  
    */
    
package com.wj.cn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wj.cn.pojo.Door;
import com.wj.cn.service.DoorService;

/**
    * @ClassName: DoorController
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Mashiroins
    * @date 2019年10月11日下午2:18:49
    * @version:1.0
    */
@Controller
@RequestMapping("/door")//表示门店模块
public class DoorController {
	@Autowired
	private DoorService doorService;//将业务层注入到控制器层
	
	
	//localhost:8060/addDoor返回一个添加门店信息的页面
	@RequestMapping("/addDoor")
	public String toAddDoorPage() {
		
		return "addDoor";
	}
	
	//处理添加门店信息
	//@RequestMapping(value="/toAddDoor",method=RequestMethod.POST)
	@PostMapping("/toAddDoor")
	public String toAddDoor(Door door) {
		//调用业务层方法
		doorService.addDoor(door);
		
		return "redirect:doorList";
	}
	//查询所有门店信息
	@GetMapping("/doorList")
	public String findDoorList(HttpServletRequest req) {
		//调用业务层方法
		List<Door> list = doorService.findAllDoorInfo();
		req.setAttribute("doorList", list);
		return "doorList";//默认转发到doorList页面
	}
	
	//查询一个门店信息
		@RequestMapping("findOne")
		public String findOne(Integer id){
			Door door = 
					doorService.SelectOne(id);
			System.out.println(door);
			
			return "door";
		}

	
	
	//toUpdate方法中，拿着id查询数据，
		//返回doorUpdate页面，在页面做回显
		@RequestMapping("toUpdate")
		public String toUpdate(
					Integer id,
						Model model){
			//拿着id查询数据
			Door door = 
					doorService.SelectOne(id);
			
			//给页面准备数据Model
			model.addAttribute("door", door);
			
			//跳转修改页面
			return "doorUpdate";
		}
		//<!-- 修改门店 -->
		@RequestMapping("update")
		public String update(Door door){
			//更新数据
			doorService.update(door);
			
			//跳转到列表(访问列表方法)
			return "redirect:doorList";
		}
		
		//删除门店
		@RequestMapping("delete")
		public String delete(Integer id){
			//删除门店
			doorService.delete(id);
			
			//跳转到列表方法（执行列表方法）
			return "redirect:doorList";
		}




}
