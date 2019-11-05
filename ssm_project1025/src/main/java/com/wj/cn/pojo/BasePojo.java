
    /**  
    * @Title: BasePojo.java
    * @Package com.wj.cn.pojo
    * @Description: TODO(用一句话描述该文件做什么)
    * @author Mashiroins
    * @date 2019年10月10日下午4:47:37
    * @version V1.0  
    */
    
package com.wj.cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
    * @ClassName: BasePojo
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Mashiroins
    * @date 2019年10月10日下午4:47:37
    * @version:1.0
    */

public class BasePojo implements Serializable {

	
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	    
	private static final long serialVersionUID = 1L;
	private Integer id;      //与tb_door表的id字段对应
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime; //与tb_door表的createTime字段对应
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updateTime; //与tb_door表的updateTime字段对应
	
	/**
	* @return id
	*/
	
	public Integer getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	* @return createTime
	*/
	
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * @param createTime the createTime to set
	 */
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	/**
	* @return updateTime
	*/
	
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * @param updateTime the updateTime to set
	 */
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
		return "BasePojo [id=" + id + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	

}
