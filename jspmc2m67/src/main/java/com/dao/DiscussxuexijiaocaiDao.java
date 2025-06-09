package com.dao;

import com.entity.DiscussxuexijiaocaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexijiaocaiVO;
import com.entity.view.DiscussxuexijiaocaiView;


/**
 * 学习教材评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-06 17:12:22
 */
public interface DiscussxuexijiaocaiDao extends BaseMapper<DiscussxuexijiaocaiEntity> {
	
	List<DiscussxuexijiaocaiVO> selectListVO(@Param("ew") Wrapper<DiscussxuexijiaocaiEntity> wrapper);
	
	DiscussxuexijiaocaiVO selectVO(@Param("ew") Wrapper<DiscussxuexijiaocaiEntity> wrapper);
	
	List<DiscussxuexijiaocaiView> selectListView(@Param("ew") Wrapper<DiscussxuexijiaocaiEntity> wrapper);

	List<DiscussxuexijiaocaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexijiaocaiEntity> wrapper);
	
	DiscussxuexijiaocaiView selectView(@Param("ew") Wrapper<DiscussxuexijiaocaiEntity> wrapper);
	
}
