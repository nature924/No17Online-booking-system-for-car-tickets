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
 * 汽车票
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
@TableName("qichepiao")
public class QichepiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QichepiaoEntity() {
		
	}
	
	public QichepiaoEntity(T t) {
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
	 * 车票名称
	 */
					
	private String chepiaomingcheng;
	
	/**
	 * 上车地点
	 */
					
	private String shangchedidian;
	
	/**
	 * 目的地
	 */
					
	private String mudedi;
	
	/**
	 * 出发时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chufashijian;
	
	/**
	 * 预计到达时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yujidaodashijian;
	
	/**
	 * 途径地
	 */
					
	private String tujingdi;
	
	/**
	 * 价格
	 */
					
	private Float jiage;
	
	/**
	 * 人数
	 */
					
	private Integer renshu;
	
	/**
	 * 详细信息
	 */
					
	private String xiangxixinxi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：车票名称
	 */
	public void setChepiaomingcheng(String chepiaomingcheng) {
		this.chepiaomingcheng = chepiaomingcheng;
	}
	/**
	 * 获取：车票名称
	 */
	public String getChepiaomingcheng() {
		return chepiaomingcheng;
	}
	/**
	 * 设置：上车地点
	 */
	public void setShangchedidian(String shangchedidian) {
		this.shangchedidian = shangchedidian;
	}
	/**
	 * 获取：上车地点
	 */
	public String getShangchedidian() {
		return shangchedidian;
	}
	/**
	 * 设置：目的地
	 */
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
	/**
	 * 设置：出发时间
	 */
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	/**
	 * 获取：出发时间
	 */
	public Date getChufashijian() {
		return chufashijian;
	}
	/**
	 * 设置：预计到达时间
	 */
	public void setYujidaodashijian(Date yujidaodashijian) {
		this.yujidaodashijian = yujidaodashijian;
	}
	/**
	 * 获取：预计到达时间
	 */
	public Date getYujidaodashijian() {
		return yujidaodashijian;
	}
	/**
	 * 设置：途径地
	 */
	public void setTujingdi(String tujingdi) {
		this.tujingdi = tujingdi;
	}
	/**
	 * 获取：途径地
	 */
	public String getTujingdi() {
		return tujingdi;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
	/**
	 * 设置：人数
	 */
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
	/**
	 * 设置：详细信息
	 */
	public void setXiangxixinxi(String xiangxixinxi) {
		this.xiangxixinxi = xiangxixinxi;
	}
	/**
	 * 获取：详细信息
	 */
	public String getXiangxixinxi() {
		return xiangxixinxi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}

}
