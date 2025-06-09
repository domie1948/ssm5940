package com.entity.vo;

import com.entity.XueyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学院信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
public class XueyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所属地区
	 */
	
	private String suoshudiqu;
		
	/**
	 * 学院级别
	 */
	
	private String xueyuanjibie;
		
	/**
	 * 学院性质
	 */
	
	private String xueyuanxingzhi;
		
	/**
	 * 学院类型
	 */
	
	private String xueyuanleixing;
		
	/**
	 * 招生电话
	 */
	
	private String zhaoshengdianhua;
		
	/**
	 * 学院邮箱
	 */
	
	private String xueyuanyouxiang;
		
	/**
	 * 学院网址
	 */
	
	private String xueyuanwangzhi;
		
	/**
	 * 学院地址
	 */
	
	private String xueyuandizhi;
		
	/**
	 * 邮政编码
	 */
	
	private String youzhengbianma;
		
	/**
	 * 学院简介
	 */
	
	private String xueyuanjianjie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：所属地区
	 */
	 
	public void setSuoshudiqu(String suoshudiqu) {
		this.suoshudiqu = suoshudiqu;
	}
	
	/**
	 * 获取：所属地区
	 */
	public String getSuoshudiqu() {
		return suoshudiqu;
	}
				
	
	/**
	 * 设置：学院级别
	 */
	 
	public void setXueyuanjibie(String xueyuanjibie) {
		this.xueyuanjibie = xueyuanjibie;
	}
	
	/**
	 * 获取：学院级别
	 */
	public String getXueyuanjibie() {
		return xueyuanjibie;
	}
				
	
	/**
	 * 设置：学院性质
	 */
	 
	public void setXueyuanxingzhi(String xueyuanxingzhi) {
		this.xueyuanxingzhi = xueyuanxingzhi;
	}
	
	/**
	 * 获取：学院性质
	 */
	public String getXueyuanxingzhi() {
		return xueyuanxingzhi;
	}
				
	
	/**
	 * 设置：学院类型
	 */
	 
	public void setXueyuanleixing(String xueyuanleixing) {
		this.xueyuanleixing = xueyuanleixing;
	}
	
	/**
	 * 获取：学院类型
	 */
	public String getXueyuanleixing() {
		return xueyuanleixing;
	}
				
	
	/**
	 * 设置：招生电话
	 */
	 
	public void setZhaoshengdianhua(String zhaoshengdianhua) {
		this.zhaoshengdianhua = zhaoshengdianhua;
	}
	
	/**
	 * 获取：招生电话
	 */
	public String getZhaoshengdianhua() {
		return zhaoshengdianhua;
	}
				
	
	/**
	 * 设置：学院邮箱
	 */
	 
	public void setXueyuanyouxiang(String xueyuanyouxiang) {
		this.xueyuanyouxiang = xueyuanyouxiang;
	}
	
	/**
	 * 获取：学院邮箱
	 */
	public String getXueyuanyouxiang() {
		return xueyuanyouxiang;
	}
				
	
	/**
	 * 设置：学院网址
	 */
	 
	public void setXueyuanwangzhi(String xueyuanwangzhi) {
		this.xueyuanwangzhi = xueyuanwangzhi;
	}
	
	/**
	 * 获取：学院网址
	 */
	public String getXueyuanwangzhi() {
		return xueyuanwangzhi;
	}
				
	
	/**
	 * 设置：学院地址
	 */
	 
	public void setXueyuandizhi(String xueyuandizhi) {
		this.xueyuandizhi = xueyuandizhi;
	}
	
	/**
	 * 获取：学院地址
	 */
	public String getXueyuandizhi() {
		return xueyuandizhi;
	}
				
	
	/**
	 * 设置：邮政编码
	 */
	 
	public void setYouzhengbianma(String youzhengbianma) {
		this.youzhengbianma = youzhengbianma;
	}
	
	/**
	 * 获取：邮政编码
	 */
	public String getYouzhengbianma() {
		return youzhengbianma;
	}
				
	
	/**
	 * 设置：学院简介
	 */
	 
	public void setXueyuanjianjie(String xueyuanjianjie) {
		this.xueyuanjianjie = xueyuanjianjie;
	}
	
	/**
	 * 获取：学院简介
	 */
	public String getXueyuanjianjie() {
		return xueyuanjianjie;
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
