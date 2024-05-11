package com.dao;

import com.entity.YouxiuzuozheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxiuzuozheVO;
import com.entity.view.YouxiuzuozheView;


/**
 * 优秀作者
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface YouxiuzuozheDao extends BaseMapper<YouxiuzuozheEntity> {
	
	List<YouxiuzuozheVO> selectListVO(@Param("ew") Wrapper<YouxiuzuozheEntity> wrapper);
	
	YouxiuzuozheVO selectVO(@Param("ew") Wrapper<YouxiuzuozheEntity> wrapper);
	
	List<YouxiuzuozheView> selectListView(@Param("ew") Wrapper<YouxiuzuozheEntity> wrapper);

	List<YouxiuzuozheView> selectListView(Pagination page,@Param("ew") Wrapper<YouxiuzuozheEntity> wrapper);
	
	YouxiuzuozheView selectView(@Param("ew") Wrapper<YouxiuzuozheEntity> wrapper);
	
}
