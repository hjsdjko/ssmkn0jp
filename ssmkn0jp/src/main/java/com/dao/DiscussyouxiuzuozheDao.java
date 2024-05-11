package com.dao;

import com.entity.DiscussyouxiuzuozheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxiuzuozheVO;
import com.entity.view.DiscussyouxiuzuozheView;


/**
 * 优秀作者评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface DiscussyouxiuzuozheDao extends BaseMapper<DiscussyouxiuzuozheEntity> {
	
	List<DiscussyouxiuzuozheVO> selectListVO(@Param("ew") Wrapper<DiscussyouxiuzuozheEntity> wrapper);
	
	DiscussyouxiuzuozheVO selectVO(@Param("ew") Wrapper<DiscussyouxiuzuozheEntity> wrapper);
	
	List<DiscussyouxiuzuozheView> selectListView(@Param("ew") Wrapper<DiscussyouxiuzuozheEntity> wrapper);

	List<DiscussyouxiuzuozheView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxiuzuozheEntity> wrapper);
	
	DiscussyouxiuzuozheView selectView(@Param("ew") Wrapper<DiscussyouxiuzuozheEntity> wrapper);
	
}
