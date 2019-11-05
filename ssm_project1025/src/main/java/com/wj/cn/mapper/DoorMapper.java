
/**  
 * @Title: DoorMapper.java
 * @Package com.wj.cn.mapper
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Mashiroins
 * @date 2019年10月10日下午4:56:42
 * @version V1.0  
 */

package com.wj.cn.mapper;

import java.util.List;

import com.wj.cn.pojo.Door;

/**
 * @ClassName: DoorMapper
 * @Description: 这个接口与DoorMapper.xml文件对应
 * @author Mashiroins
 * @date 2019年10月10日下午4:56:42
 * @version:1.0
 */

public interface DoorMapper {

	//添加门店信息
	public Integer addDoor(Door door);

	//查询门店信息
	public List<Door> findAllDoorInfo();

	//<!-- 查询一个门店 -->
	public Door SelectOne(Integer id);


	//<!-- 修改门店 now()获取当前时间-->
	public void update(Door door);

	//<!-- 删除门店 -->
	public void delete(Integer id);

}
