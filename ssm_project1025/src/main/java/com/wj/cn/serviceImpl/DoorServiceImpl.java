
/**  
 * @Title: DoorServiceImpl.java
 * @Package com.wj.cn.serviceImpl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Mashiroins
 * @date 2019年10月11日下午1:53:26
 * @version V1.0  
 */

package com.wj.cn.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.cn.mapper.DoorMapper;
import com.wj.cn.pojo.Door;
import com.wj.cn.service.DoorService;

/**
 * @ClassName: DoorServiceImpl
 * @Description: 业务层接口的实现
 * @author Mashiroins
 * @date 2019年10月11日下午1:53:26
 * @version:1.0
 */
@Service//表明业务层。加了这个注解以后，这个类会交给spring容器进行管理
//@Repository @Controller 这些注解也可以加载这个类上方，但是为了明确该类是处理什么业务的，所以加对应含义的注解
public class DoorServiceImpl implements DoorService{

	//在业务层实现类中调用Mapper接口的方法
	@Autowired
	private DoorMapper doorMapper;//将持久层对象注入到业务层，使用@Autowried注解

	@Override
	public Integer addDoor(Door door) {
		Integer row=0;
		//对参数进行判断
		if(door!=null) {
			//调用持久层接口方法
			row=doorMapper.addDoor(door);

		}else {
			throw new RuntimeException("请填写门店的相关信息");
		}

		return row;
	}


	/* (非 Javadoc)
	 * <p>Title: findAllDoorInfo</p>
	 * <p>Description: </p>
	 * @return
	 * @see com.wj.cn.service.DoorService#findAllDoorInfo()
	 */

	@Override
	public List<Door> findAllDoorInfo() {
		// TODO Auto-generated method stub

		List<Door> list = doorMapper.findAllDoorInfo();


		return list;
	}



	/* (非 Javadoc)
	 * <p>Title: SelectOne</p>
	 * <p>Description: </p>
	 * @param id
	 * @return
	 * @see com.wj.cn.service.DoorService#SelectOne(java.lang.Integer)
	 */

	@Override
	public Door SelectOne(Integer id) {
		// TODO Auto-generated method stub
		return doorMapper.SelectOne(id);
	}



	/* (非 Javadoc)
	 * <p>Title: update</p>
	 * <p>Description: </p>
	 * @param door
	 * @see com.wj.cn.service.DoorService#update(com.wj.cn.pojo.Door)
	 */

	@Override
	public void update(Door door) {
		// TODO Auto-generated method stub
		doorMapper.update(door);
	}







	/* (非 Javadoc)
	 * <p>Title: delete</p>
	 * <p>Description: </p>
	 * @param id
	 * @see com.wj.cn.service.DoorService#delete(java.lang.Integer)
	 */

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		doorMapper.delete(id);
	}



}
