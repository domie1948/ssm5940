package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexijiaocaiDao;
import com.entity.XuexijiaocaiEntity;
import com.service.XuexijiaocaiService;
import com.entity.vo.XuexijiaocaiVO;
import com.entity.view.XuexijiaocaiView;

@Service("xuexijiaocaiService")
public class XuexijiaocaiServiceImpl extends ServiceImpl<XuexijiaocaiDao, XuexijiaocaiEntity> implements XuexijiaocaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexijiaocaiEntity> page = this.selectPage(
                new Query<XuexijiaocaiEntity>(params).getPage(),
                new EntityWrapper<XuexijiaocaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexijiaocaiEntity> wrapper) {
		  Page<XuexijiaocaiView> page =new Query<XuexijiaocaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexijiaocaiVO> selectListVO(Wrapper<XuexijiaocaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexijiaocaiVO selectVO(Wrapper<XuexijiaocaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexijiaocaiView> selectListView(Wrapper<XuexijiaocaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexijiaocaiView selectView(Wrapper<XuexijiaocaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
