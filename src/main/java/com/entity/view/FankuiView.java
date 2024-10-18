package com.entity.view;

import com.entity.FankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
@TableName("fankui")
public class FankuiView  extends FankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FankuiView(){
	}
 
 	public FankuiView(FankuiEntity fankuiEntity){
 	try {
			BeanUtils.copyProperties(this, fankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
