
    /**  
    * @Title: Door.java
    * @Package com.wj.cn.pojo
    * @Description: TODO(用一句话描述该文件做什么)
    * @author Mashiroins
    * @date 2019年10月10日下午4:36:25
    * @version V1.0  
    */
    
package com.wj.cn.pojo;

import java.io.Serializable;

/**
    * @ClassName: Door
    * @Description: 根据门店表tb_door映射实体类对象实现ORM
    * @author Mashiroins
    * @date 2019年10月10日下午4:36:25
    * @version:1.0
    */

public class Door extends BasePojo implements Serializable {
	
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	    
	private static final long serialVersionUID = 1L;
	//根据表的字段封装属性
	private String doorName; //与tb_door表的doorName字段对应
	private String tel;		 //与tb_door表的tel字段对应

	
	/**
	* @return doorName
	*/
	
	public String getDoorName() {
		return doorName;
	}
	
	/**
	 * @param doorName the doorName to set
	 */
	
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	
	/**
	* @return tel
	*/
	
	public String getTel() {
		return tel;
	}
	
	/**
	 * @param tel the tel to set
	 */
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	/**
	* @return serialversionuid
	*/
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	    /* (非 Javadoc)
	    * <p>Title: toString</p>
	    * <p>Description: </p>
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "Door [doorName=" + doorName + ", tel=" + tel + "]";
	}
	
	
	
	

	
	

}
