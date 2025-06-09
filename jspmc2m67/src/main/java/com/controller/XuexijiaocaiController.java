package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XuexijiaocaiEntity;
import com.entity.view.XuexijiaocaiView;

import com.service.XuexijiaocaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 学习教材
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
@RestController
@RequestMapping("/xuexijiaocai")
public class XuexijiaocaiController {
    @Autowired
    private XuexijiaocaiService xuexijiaocaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexijiaocaiEntity xuexijiaocai, HttpServletRequest request){

        EntityWrapper<XuexijiaocaiEntity> ew = new EntityWrapper<XuexijiaocaiEntity>();
    	PageUtils page = xuexijiaocaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexijiaocai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexijiaocaiEntity xuexijiaocai, HttpServletRequest request){
        EntityWrapper<XuexijiaocaiEntity> ew = new EntityWrapper<XuexijiaocaiEntity>();
    	PageUtils page = xuexijiaocaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexijiaocai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexijiaocaiEntity xuexijiaocai){
       	EntityWrapper<XuexijiaocaiEntity> ew = new EntityWrapper<XuexijiaocaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexijiaocai, "xuexijiaocai")); 
        return R.ok().put("data", xuexijiaocaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexijiaocaiEntity xuexijiaocai){
        EntityWrapper< XuexijiaocaiEntity> ew = new EntityWrapper< XuexijiaocaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexijiaocai, "xuexijiaocai")); 
		XuexijiaocaiView xuexijiaocaiView =  xuexijiaocaiService.selectView(ew);
		return R.ok("查询学习教材成功").put("data", xuexijiaocaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexijiaocaiEntity xuexijiaocai = xuexijiaocaiService.selectById(id);
		xuexijiaocai.setClicknum(xuexijiaocai.getClicknum()+1);
		xuexijiaocai.setClicktime(new Date());
		xuexijiaocaiService.updateById(xuexijiaocai);
        return R.ok().put("data", xuexijiaocai);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexijiaocaiEntity xuexijiaocai = xuexijiaocaiService.selectById(id);
		xuexijiaocai.setClicknum(xuexijiaocai.getClicknum()+1);
		xuexijiaocai.setClicktime(new Date());
		xuexijiaocaiService.updateById(xuexijiaocai);
        return R.ok().put("data", xuexijiaocai);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        XuexijiaocaiEntity xuexijiaocai = xuexijiaocaiService.selectById(id);
        if(type.equals("1")) {
        	xuexijiaocai.setThumbsupnum(xuexijiaocai.getThumbsupnum()+1);
        } else {
        	xuexijiaocai.setCrazilynum(xuexijiaocai.getCrazilynum()+1);
        }
        xuexijiaocaiService.updateById(xuexijiaocai);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexijiaocaiEntity xuexijiaocai, HttpServletRequest request){
    	xuexijiaocai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuexijiaocai);

        xuexijiaocaiService.insert(xuexijiaocai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexijiaocaiEntity xuexijiaocai, HttpServletRequest request){
    	xuexijiaocai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuexijiaocai);

        xuexijiaocaiService.insert(xuexijiaocai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XuexijiaocaiEntity xuexijiaocai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexijiaocai);
        xuexijiaocaiService.updateById(xuexijiaocai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexijiaocaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XuexijiaocaiEntity> wrapper = new EntityWrapper<XuexijiaocaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xuexijiaocaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XuexijiaocaiEntity xuexijiaocai, HttpServletRequest request,String pre){
        EntityWrapper<XuexijiaocaiEntity> ew = new EntityWrapper<XuexijiaocaiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = xuexijiaocaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexijiaocai), params), params));
        return R.ok().put("data", page);
    }


}
