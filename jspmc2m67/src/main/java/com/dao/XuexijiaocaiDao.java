package com.dao;

import com.entity.XuexijiaocaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexijiaocaiVO;
import com.entity.view.XuexijiaocaiView;


/**
 * 学习教材
 * 
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
public interface XuexijiaocaiDao extends BaseMapper<XuexijiaocaiEntity> {
	
	List<XuexijiaocaiVO> selectListVO(@Param("ew") Wrapper<XuexijiaocaiEntity> wrapper);
	
	XuexijiaocaiVO selectVO(@Param("ew") Wrapper<XuexijiaocaiEntity> wrapper);
	
	List<XuexijiaocaiView> selectListView(@Param("ew") Wrapper<XuexijiaocaiEntity> wrapper);

	List<XuexijiaocaiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexijiaocaiEntity> wrapper);
	
	XuexijiaocaiView selectView(@Param("ew") Wrapper<XuexijiaocaiEntity> wrapper);
	
}
