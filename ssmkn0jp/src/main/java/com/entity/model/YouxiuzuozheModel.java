package com.entity.model;

import com.entity.YouxiuzuozheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 优秀作者
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public class YouxiuzuozheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 座右铭
	 */
	
	private String zuoyouming;
		
	/**
	 * 作者照片
	 */
	
	private String zuozhezhaopian;
		
	/**
	 * 往期作品
	 */
	
	private String wangqizuopin;
		
	/**
	 * 作者简介
	 */
	
	private String zuozhejianjie;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：座右铭
	 */
	 
	public void setZuoyouming(String zuoyouming) {
		this.zuoyouming = zuoyouming;
	}
	
	/**
	 * 获取：座右铭
	 */
	public String getZuoyouming() {
		return zuoyouming;
	}
				
	
	/**
	 * 设置：作者照片
	 */
	 
	public void setZuozhezhaopian(String zuozhezhaopian) {
		this.zuozhezhaopian = zuozhezhaopian;
	}
	
	/**
	 * 获取：作者照片
	 */
	public String getZuozhezhaopian() {
		return zuozhezhaopian;
	}
				
	
	/**
	 * 设置：往期作品
	 */
	 
	public void setWangqizuopin(String wangqizuopin) {
		this.wangqizuopin = wangqizuopin;
	}
	
	/**
	 * 获取：往期作品
	 */
	public String getWangqizuopin() {
		return wangqizuopin;
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
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
