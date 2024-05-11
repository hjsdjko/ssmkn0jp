package com.entity.vo;

import com.entity.WodefenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 我的分享
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public class WodefenxiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标签
	 */
	
	private String biaoqian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 作品集简介
	 */
	
	private String zuopinjijianjie;
		
	/**
	 * 作者名称
	 */
	
	private String zuozhemingcheng;
		
	/**
	 * 作者简介
	 */
	
	private String zuozhejianjie;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：标签
	 */
	 
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：作品集简介
	 */
	 
	public void setZuopinjijianjie(String zuopinjijianjie) {
		this.zuopinjijianjie = zuopinjijianjie;
	}
	
	/**
	 * 获取：作品集简介
	 */
	public String getZuopinjijianjie() {
		return zuopinjijianjie;
	}
				
	
	/**
	 * 设置：作者名称
	 */
	 
	public void setZuozhemingcheng(String zuozhemingcheng) {
		this.zuozhemingcheng = zuozhemingcheng;
	}
	
	/**
	 * 获取：作者名称
	 */
	public String getZuozhemingcheng() {
		return zuozhemingcheng;
	}
				
	
	/**
	 * 设置：作者简介
	 */
	 
	public void setZuozhejianjie(String zuozhejianjie) {
		this.zuozhejianjie = zuozhejianjie;
	}
	
	/**
	 * 获取：作者简介
	 */
	public String getZuozhejianjie() {
		return zuozhejianjie;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
