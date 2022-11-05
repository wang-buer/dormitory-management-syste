package com.entity.vo;

import com.entity.ShuidianfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 水电费
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-30 19:50:51
 */
public class ShuidianfeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 收费类型
	 */
	
	private String shoufeileixing;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
	/**
	 * 设置：收费类型
	 */
	 
	public void setShoufeileixing(String shoufeileixing) {
		this.shoufeileixing = shoufeileixing;
	}
	
	/**
	 * 获取：收费类型
	 */
	public String getShoufeileixing() {
		return shoufeileixing;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
			
}
