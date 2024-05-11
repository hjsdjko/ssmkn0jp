package com.entity.view;

import com.entity.DiscussyouxiuzuozheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 优秀作者评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
@TableName("discussyouxiuzuozhe")
public class DiscussyouxiuzuozheView  extends DiscussyouxiuzuozheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyouxiuzuozheView(){
	}
 
 	public DiscussyouxiuzuozheView(DiscussyouxiuzuozheEntity discussyouxiuzuozheEntity){
 	try {
			BeanUtils.copyProperties(this, discussyouxiuzuozheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
