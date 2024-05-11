package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 优秀作者
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
@TableName("youxiuzuozhe")
public class YouxiuzuozheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxiuzuozheEntity() {
		
	}
	
	public YouxiuzuozheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 作者姓名
	 */
					
	private String zuozhexingming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作者姓名
	 */
	public void setZuozhexingming(String zuozhexingming) {
		this.zuozhexingming = zuozhexingming;
	}
	/**
	 * 获取：作者姓名
	 */
	public String getZuozhexingming() {
		return zuozhexingming;
	}
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
