package com.entity.view;

import com.entity.FangkexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 访客信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-30 19:50:51
 */
@TableName("fangkexinxi")
public class FangkexinxiView  extends FangkexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangkexinxiView(){
	}
 
 	public FangkexinxiView(FangkexinxiEntity fangkexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fangkexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
