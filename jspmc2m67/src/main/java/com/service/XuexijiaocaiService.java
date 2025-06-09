package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexijiaocaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexijiaocaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexijiaocaiView;


/**
 * 学习教材
 *
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
public interface XuexijiaocaiService extends IService<XuexijiaocaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexijiaocaiVO> selectListVO(Wrapper<XuexijiaocaiEntity> wrapper);
   	
   	XuexijiaocaiVO selectVO(@Param("ew") Wrapper<XuexijiaocaiEntity> wrapper);
   	
   	List<XuexijiaocaiView> selectListView(Wrapper<XuexijiaocaiEntity> wrapper);
   	
   	XuexijiaocaiView selectView(@Param("ew") Wrapper<XuexijiaocaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexijiaocaiEntity> wrapper);
   	
}

