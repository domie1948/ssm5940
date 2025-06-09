package com.entity.model;

import com.entity.XuexijiaocaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学习教材
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
public class XuexijiaocaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
