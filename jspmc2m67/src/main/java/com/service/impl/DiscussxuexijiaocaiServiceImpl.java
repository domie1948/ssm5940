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


import com.dao.DiscussxuexijiaocaiDao;
import com.entity.DiscussxuexijiaocaiEntity;
import com.service.DiscussxuexijiaocaiService;
import com.entity.vo.DiscussxuexijiaocaiVO;
import com.entity.view.DiscussxuexijiaocaiView;

@Service("discussxuexijiaocaiService")
public class DiscussxuexijiaocaiServiceImpl extends ServiceImpl<DiscussxuexijiaocaiDao, DiscussxuexijiaocaiEntity> implements DiscussxuexijiaocaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexijiaocaiEntity> page = this.selectPage(
                new Query<DiscussxuexijiaocaiEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexijiaocaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexijiaocaiEntity> wrapper) {
		  Page<DiscussxuexijiaocaiView> page =new Query<DiscussxuexijiaocaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexijiaocaiVO> selectListVO(Wrapper<DiscussxuexijiaocaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexijiaocaiVO selectVO(Wrapper<DiscussxuexijiaocaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexijiaocaiView> selectListView(Wrapper<DiscussxuexijiaocaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexijiaocaiView selectView(Wrapper<DiscussxuexijiaocaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
