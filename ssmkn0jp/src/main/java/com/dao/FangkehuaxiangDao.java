package com.dao;

import com.entity.FangkehuaxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkehuaxiangVO;
import com.entity.view.FangkehuaxiangView;


/**
 * 访客画像
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface FangkehuaxiangDao extends BaseMapper<FangkehuaxiangEntity> {
	
	List<FangkehuaxiangVO> selectListVO(@Param("ew") Wrapper<FangkehuaxiangEntity> wrapper);
	
	FangkehuaxiangVO selectVO(@Param("ew") Wrapper<FangkehuaxiangEntity> wrapper);
	
	List<FangkehuaxiangView> selectListView(@Param("ew") Wrapper<FangkehuaxiangEntity> wrapper);

	List<FangkehuaxiangView> selectListView(Pagination page,@Param("ew") Wrapper<FangkehuaxiangEntity> wrapper);
	
	FangkehuaxiangView selectView(@Param("ew") Wrapper<FangkehuaxiangEntity> wrapper);
	
}
