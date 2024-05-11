package com.entity.model;

import com.entity.ZuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public class ZuopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作品分类
	 */
	
	private String zuopinfenlei;
		
	/**
	 * 作品封面
	 */
	
	private String zuopinfengmian;
		
	/**
	 * 作品内容
	 */
	
	private String zuopinneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 作品简介
	 */
	
	private String zuopinjianjie;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：作品分类
	 */
	 
	public void setZuopinfenlei(String zuopinfenlei) {
		this.zuopinfenlei = zuopinfenlei;
	}
	
	/**
	 * 获取：作品分类
	 */
	public String getZuopinfenlei() {
		return zuopinfenlei;
	}
				
	
	/**
	 * 设置：作品封面
	 */
	 
	public void setZuopinfengmian(String zuopinfengmian) {
		this.zuopinfengmian = zuopinfengmian;
	}
	
	/**
	 * 获取：作品封面
	 */
	public String getZuopinfengmian() {
		return zuopinfengmian;
	}
				
	
	/**
	 * 设置：作品内容
	 */
	 
	public void setZuopinneirong(String zuopinneirong) {
		this.zuopinneirong = zuopinneirong;
	}
	
	/**
	 * 获取：作品内容
	 */
	public String getZuopinneirong() {
		return zuopinneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：作品简介
	 */
	 
	public void setZuopinjianjie(String zuopinjianjie) {
		this.zuopinjianjie = zuopinjianjie;
	}
	
	/**
	 * 获取：作品简介
	 */
	public String getZuopinjianjie() {
		return zuopinjianjie;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
