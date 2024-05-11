package com.dao;

import com.entity.ZuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuopinVO;
import com.entity.view.ZuopinView;


/**
 * 作品
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface ZuopinDao extends BaseMapper<ZuopinEntity> {
	
	List<ZuopinVO> selectListVO(@Param("ew") Wrapper<ZuopinEntity> wrapper);
	
	ZuopinVO selectVO(@Param("ew") Wrapper<ZuopinEntity> wrapper);
	
	List<ZuopinView> selectListView(@Param("ew") Wrapper<ZuopinEntity> wrapper);

	List<ZuopinView> selectListView(Pagination page,@Param("ew") Wrapper<ZuopinEntity> wrapper);
	
	ZuopinView selectView(@Param("ew") Wrapper<ZuopinEntity> wrapper);
	
}
