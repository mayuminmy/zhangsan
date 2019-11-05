
/**  
 * @Title: DoorService.java
 * @Package com.wj.cn.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Mashiroins
 * @date 2019年10月11日下午1:45:47
 * @version V1.0  
 */

package com.wj.cn.service;

import java.util.List;

import com.wj.cn.pojo.Door;

/**
 * @ClassName: DoorService
 * @Description: 业务层接口
 * @author Mashiroins
 * @date 2019年10月11日下午1:45:47
 * @version:1.0
 */

public interface DoorService {
	/*
	 * 在业务层接口中定义的抽象方法，一般建议这里的抽象方法和
	 * Mapper接口的抽象方法一致即可
	 * 但是，也可以跟Mapper接口的抽象方法不一样的情况
	 * 
	 * */
	//添加门店信息
	public Integer addDoor(Door door);

	//查询门店信息
	public List<Door> findAllDoorInfo();
	
	//<!-- 查询一个门店 -->
		//<select id="SelectOne"
		//resultType="cn.tedu.pojo.Door">
		public Door SelectOne(Integer id);



	//<!-- 修改门店 now()获取当前时间-->

	public void update(Door door);
	
	//<!-- 删除门店 -->
		//<delete id="delete">
		public void delete(Integer id);


}
