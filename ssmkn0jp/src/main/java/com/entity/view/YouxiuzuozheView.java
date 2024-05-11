package com.entity.view;

import com.entity.YouxiuzuozheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 优秀作者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
@TableName("youxiuzuozhe")
public class YouxiuzuozheView  extends YouxiuzuozheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxiuzuozheView(){
	}
 
 	public YouxiuzuozheView(YouxiuzuozheEntity youxiuzuozheEntity){
 	try {
			BeanUtils.copyProperties(this, youxiuzuozheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
