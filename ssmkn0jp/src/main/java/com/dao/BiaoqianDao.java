package com.dao;

import com.entity.BiaoqianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaoqianVO;
import com.entity.view.BiaoqianView;


/**
 * 标签
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface BiaoqianDao extends BaseMapper<BiaoqianEntity> {
	
	List<BiaoqianVO> selectListVO(@Param("ew") Wrapper<BiaoqianEntity> wrapper);
	
	BiaoqianVO selectVO(@Param("ew") Wrapper<BiaoqianEntity> wrapper);
	
	List<BiaoqianView> selectListView(@Param("ew") Wrapper<BiaoqianEntity> wrapper);

	List<BiaoqianView> selectListView(Pagination page,@Param("ew") Wrapper<BiaoqianEntity> wrapper);
	
	BiaoqianView selectView(@Param("ew") Wrapper<BiaoqianEntity> wrapper);
	
}
