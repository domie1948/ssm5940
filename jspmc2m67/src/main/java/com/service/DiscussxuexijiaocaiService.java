package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexijiaocaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexijiaocaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexijiaocaiView;


/**
 * 学习教材评论表
 *
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
public interface DiscussxuexijiaocaiService extends IService<DiscussxuexijiaocaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexijiaocaiVO> selectListVO(Wrapper<DiscussxuexijiaocaiEntity> wrapper);
   	
   	DiscussxuexijiaocaiVO selectVO(@Param("ew") Wrapper<DiscussxuexijiaocaiEntity> wrapper);
   	
   	List<DiscussxuexijiaocaiView> selectListView(Wrapper<DiscussxuexijiaocaiEntity> wrapper);
   	
   	DiscussxuexijiaocaiView selectView(@Param("ew") Wrapper<DiscussxuexijiaocaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexijiaocaiEntity> wrapper);
   	
}

