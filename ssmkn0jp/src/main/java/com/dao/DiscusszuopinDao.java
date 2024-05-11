package com.dao;

import com.entity.DiscusszuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszuopinVO;
import com.entity.view.DiscusszuopinView;


/**
 * 作品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface DiscusszuopinDao extends BaseMapper<DiscusszuopinEntity> {
	
	List<DiscusszuopinVO> selectListVO(@Param("ew") Wrapper<DiscusszuopinEntity> wrapper);
	
	DiscusszuopinVO selectVO(@Param("ew") Wrapper<DiscusszuopinEntity> wrapper);
	
	List<DiscusszuopinView> selectListView(@Param("ew") Wrapper<DiscusszuopinEntity> wrapper);

	List<DiscusszuopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszuopinEntity> wrapper);
	
	DiscusszuopinView selectView(@Param("ew") Wrapper<DiscusszuopinEntity> wrapper);
	
}
