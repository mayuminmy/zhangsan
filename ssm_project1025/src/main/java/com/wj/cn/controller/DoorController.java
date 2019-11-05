
    /**  
    * @Title: DoorController.java
    * @Package com.wj.cn.controller
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author Mashiroins
    * @date 2019��10��11������2:18:49
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
    * @Description: TODO(������һ�仰��������������)
    * @author Mashiroins
    * @date 2019��10��11������2:18:49
    * @version:1.0
    */
@Controller
@RequestMapping("/door")//��ʾ�ŵ�ģ��
public class DoorController {
	@Autowired
	private DoorService doorService;//��ҵ���ע�뵽��������
	
	
	//localhost:8060/addDoor����һ������ŵ���Ϣ��ҳ��
	@RequestMapping("/addDoor")
	public String toAddDoorPage() {
		
		return "addDoor";
	}
	
	//��������ŵ���Ϣ
	//@RequestMapping(value="/toAddDoor",method=RequestMethod.POST)
	@PostMapping("/toAddDoor")
	public String toAddDoor(Door door) {
		//����ҵ��㷽��
		doorService.addDoor(door);
		
		return "redirect:doorList";
	}
	//��ѯ�����ŵ���Ϣ
	@GetMapping("/doorList")
	public String findDoorList(HttpServletRequest req) {
		//����ҵ��㷽��
		List<Door> list = doorService.findAllDoorInfo();
		req.setAttribute("doorList", list);
		return "doorList";//Ĭ��ת����doorListҳ��
	}
	
	//��ѯһ���ŵ���Ϣ
		@RequestMapping("findOne")
		public String findOne(Integer id){
			Door door = 
					doorService.SelectOne(id);
			System.out.println(door);
			
			return "door";
		}

	
	
	//toUpdate�����У�����id��ѯ���ݣ�
		//����doorUpdateҳ�棬��ҳ��������
		@RequestMapping("toUpdate")
		public String toUpdate(
					Integer id,
						Model model){
			//����id��ѯ����
			Door door = 
					doorService.SelectOne(id);
			
			//��ҳ��׼������Model
			model.addAttribute("door", door);
			
			//��ת�޸�ҳ��
			return "doorUpdate";
		}
		//<!-- �޸��ŵ� -->
		@RequestMapping("update")
		public String update(Door door){
			//��������
			doorService.update(door);
			
			//��ת���б�(�����б���)
			return "redirect:doorList";
		}
		
		//ɾ���ŵ�
		@RequestMapping("delete")
		public String delete(Integer id){
			//ɾ���ŵ�
			doorService.delete(id);
			
			//��ת���б�����ִ���б�����
			return "redirect:doorList";
		}




}
