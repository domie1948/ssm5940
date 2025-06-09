package com.entity.view;

import com.entity.DiscussxuexijiaocaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习教材评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
@TableName("discussxuexijiaocai")
public class DiscussxuexijiaocaiView  extends DiscussxuexijiaocaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuexijiaocaiView(){
	}
 
 	public DiscussxuexijiaocaiView(DiscussxuexijiaocaiEntity discussxuexijiaocaiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuexijiaocaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
