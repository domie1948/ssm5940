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
 * 学习教材
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
@TableName("xuexijiaocai")
public class XuexijiaocaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexijiaocaiEntity() {
		
	}
	
	public XuexijiaocaiEntity(T t) {
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
	 * 教材编号
	 */
					
	private String jiaocaibianhao;
	
	/**
	 * 教材名称
	 */
					
	private String jiaocaimingcheng;
	
	/**
	 * 教材类型
	 */
					
	private String jiaocaileixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 教材简介
	 */
					
	private String jiaocaijianjie;
	
	/**
	 * 内容介绍
	 */
					
	private String neirongjieshao;
	
	/**
	 * 上传时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangchuanshijian;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
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
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：教材编号
	 */
	public void setJiaocaibianhao(String jiaocaibianhao) {
		this.jiaocaibianhao = jiaocaibianhao;
	}
	/**
	 * 获取：教材编号
	 */
	public String getJiaocaibianhao() {
		return jiaocaibianhao;
	}
	/**
	 * 设置：教材名称
	 */
	public void setJiaocaimingcheng(String jiaocaimingcheng) {
		this.jiaocaimingcheng = jiaocaimingcheng;
	}
	/**
	 * 获取：教材名称
	 */
	public String getJiaocaimingcheng() {
		return jiaocaimingcheng;
	}
	/**
	 * 设置：教材类型
	 */
	public void setJiaocaileixing(String jiaocaileixing) {
		this.jiaocaileixing = jiaocaileixing;
	}
	/**
	 * 获取：教材类型
	 */
	public String getJiaocaileixing() {
		return jiaocaileixing;
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
	/**
	 * 设置：教材简介
	 */
	public void setJiaocaijianjie(String jiaocaijianjie) {
		this.jiaocaijianjie = jiaocaijianjie;
	}
	/**
	 * 获取：教材简介
	 */
	public String getJiaocaijianjie() {
		return jiaocaijianjie;
	}
	/**
	 * 设置：内容介绍
	 */
	public void setNeirongjieshao(String neirongjieshao) {
		this.neirongjieshao = neirongjieshao;
	}
	/**
	 * 获取：内容介绍
	 */
	public String getNeirongjieshao() {
		return neirongjieshao;
	}
	/**
	 * 设置：上传时间
	 */
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
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
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
