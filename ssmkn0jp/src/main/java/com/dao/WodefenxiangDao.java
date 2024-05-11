package com.dao;

import com.entity.WodefenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodefenxiangVO;
import com.entity.view.WodefenxiangView;


/**
 * 我的分享
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface WodefenxiangDao extends BaseMapper<WodefenxiangEntity> {
	
	List<WodefenxiangVO> selectListVO(@Param("ew") Wrapper<WodefenxiangEntity> wrapper);
	
	WodefenxiangVO selectVO(@Param("ew") Wrapper<WodefenxiangEntity> wrapper);
	
	List<WodefenxiangView> selectListView(@Param("ew") Wrapper<WodefenxiangEntity> wrapper);

	List<WodefenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<WodefenxiangEntity> wrapper);
	
	WodefenxiangView selectView(@Param("ew") Wrapper<WodefenxiangEntity> wrapper);
	
}
